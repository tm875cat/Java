package ATM項目;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//ATM系統登入口
public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>(); // 定義一個集合存放所有帳戶
        // 系統首頁
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===========================ATM系統===============================");
            System.out.println("1.帳戶登入");
            System.out.println("2.帳戶開戶");
            System.out.println("輸入操作指令");
            int command = sc.nextInt();
            switch (command) {// 選擇操作指令
                case 1:// 登入
                    login(accounts, sc);
                    break;
                case 2:// 開戶
                    register(accounts, sc);
                    break;
                default:// 輸入錯誤
                    System.out.println("命令輸入錯誤請重新輸入");
                    break;
            }
        }

    }

    // 開戶功能
    public static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==============================系統開戶======================================");
        Account account = new Account();
        System.out.println("請輸入用戶名稱:");
        String userName = sc.next();
        account.setUserName(userName);
        while (true) {
            System.out.println("請輸入密碼");
            String passWord = sc.next();
            System.out.println("再次輸入密碼");
            String okPassWord = sc.next();
            if (okPassWord.equals(passWord)) {
                account.setPassWord(passWord);
                break;
            } else {
                System.out.println("輸入密碼不一致，請重新輸入");
            }
        }
        System.out.println("請輸入單次提領金額上限:");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);
        // 為帳戶生成一個隨機8位卡號且不與其他帳戶重複(獨立功能另外寫)
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        accounts.add(account);
        System.out.println(accounts.get(accounts.size() - 1).getUserName() + "恭喜您開戶成功您的卡號是"
                + accounts.get(accounts.size() - 1).getCardId() + "請妥善保管卡片");
    }

    // 為帳戶生成一個隨機8位卡號且不與其他帳戶重複
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 4; i++) {
                cardId += r.nextInt(10);
            }
            if (getAccountByCardId(cardId, accounts) == null) {
                return cardId;
            }
        }

    }

    // 登入功能
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=====================系統登入操作=====================");
        if (accounts.size() == 0) {
            System.out.println("目前系統內無任何帳戶，請先註冊後再使用");
            return;
        }
        while (true) {
            System.out.println("請輸入登錄卡號:");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null) {// 卡號存在
                while (true) {
                    System.out.println("請輸入密碼");
                    String passWord = sc.next();
                    if (acc.getPassWord().equals(passWord)) {// 判斷密碼是否正確
                        System.out.println(acc.getUserName() + "登入成功" + "您的卡號是" + acc.getCardId());
                        // 進入登錄操作頁
                        showUserCommand(sc, acc, accounts);
                        return;
                    } else {
                        System.out.println("密碼錯誤，重新輸入");
                    }
                }

            } else {// 卡號不存在
                System.out.println("卡號不存在，請重新輸入");
            }
        }
    }

    // 登入操作頁面
    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("===========================用戶操作頁================================");
            System.out.println("1.查詢帳戶");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.轉帳");
            System.out.println("5.修改密碼");
            System.out.println("6.退出");
            System.out.println("7.註銷帳戶");
            System.out.println("請輸入操作指令:");
            int command = sc.nextInt();
            switch (command) {

                case 1:// 查詢帳戶
                    showAccount(acc);
                    break;
                case 2: // 存款
                    depositMoney(acc, sc);
                    break;
                case 3: // 取款
                    drawMoney(acc, sc);
                    break;
                case 4:// 轉帳
                    sentMoney(sc, acc, accounts);
                    break;
                case 5:// 修改密碼
                    updatepassWord(sc, acc);
                    return;
                case 6:// 退出
                    System.out.println("退出成功");
                    return;
                case 7:// 註銷帳戶
                    if (delAccount(sc, acc, accounts)) {
                        //刪除成功回首頁
                        return;
                    }
                    break;
                default:
                    System.out.println("指令錯誤");
            }
        }
    }

    // 刪除帳戶功能
    private static boolean delAccount(Scanner sc, Account acc, ArrayList<Account> accounts) {
        System.out.println("=======================帳戶刪除=========================");
        System.out.println("確定要銷毀?y/n");
        String rs = sc.next();
        switch (rs) {
            case "y":
                if (acc.getMoney() > 0) {
                    System.out.println("帳戶內尚有餘額不可刪除");
                } else {
                    accounts.remove(acc);
                    System.out.println("帳戶銷毀");
                    return true;
                }

            default:
                System.out.println("取消銷毀");

        }
        return false;
    }

    // 修改密碼
    private static void updatepassWord(Scanner sc, Account acc) {
        System.out.println("=======================帳戶密碼修改=============================");
        while (true) {
            System.out.println("輸入當前密碼");
            String password = sc.next();
            if (acc.getPassWord().equals(password)) {
                // 密碼正確
                while (true) {
                    System.out.println("輸入新密碼");
                    String newPassWord = sc.next();
                    System.out.println("再次輸入新密碼");
                    String okPassWord = sc.next();
                    if (newPassWord.equals(okPassWord)) {
                        acc.setPassWord(newPassWord);
                        System.out.println("密碼修改成功，請重新登入");
                        return;
                    } else {
                        System.out.println("您輸入的兩次密碼不一樣");
                    }
                }

            } else {
                System.out.println("密碼錯誤");
            }

        }

    }

    // 取款功能(低於100不給取)
    private static void drawMoney(Account acc, Scanner sc) {
        if (acc.getMoney() < 100) {
            System.out.println("帳戶餘額低於100，請先存款");
            return;
        }
        while (true) {
            System.out.println("請輸入提款金額");
            double money = sc.nextDouble();
            if (money > acc.getQuotaMoney()) {
                System.out.println("超出單筆交易上限(" + acc.getQuotaMoney() + "元" + ")");
            } else if (money > acc.getMoney()) {
                System.out.println("餘額不足");
            } else {
                acc.setMoney(acc.getMoney() - money);
                System.out.println("取出" + money + "元");
                showAccount(acc);
                break;
            }

        }

    }

    // 轉帳功能
    private static void sentMoney(Scanner sc, Account acc, ArrayList<Account> accounts) {
        if (accounts.size() < 2) {
            System.out.println("系統不夠兩個帳戶，再開一個");
            return;
        }
        if (acc.getMoney() == 0) {
            System.out.println("你沒錢了，去存錢");
            return;
        }
        while (true) {
            System.out.println("請輸入對方的卡號");
            String otherId = sc.next();
            Account otherAcc = getAccountByCardId(otherId, accounts);
            if (acc.getCardId().equals(otherId)) {
                System.out.println("不可以輸入自己的卡號");
                continue;
            }
            if (otherAcc == null) {
                System.out.println("查無此帳戶請重新輸入");
            } else {
                String tip = otherAcc.getUserName().substring(1);
                System.out.println("請輸入" + "*" + tip + "的姓氏");
                String preName = otherAcc.getUserName().substring(0, 1);// preName=姓氏
                String name = sc.next();
                if (name.equals(preName)) {
                    while (true) {
                        System.out.println("輸入轉帳金額");
                        double money = sc.nextInt();
                        if (money > acc.getMoney()) {
                            System.out.println("餘額不足重新輸入，餘額剩餘" + acc.getMoney() + "元");
                        } else if (money > acc.getQuotaMoney()) {
                            System.out.println("單筆轉帳金額過高轉帳金額上限為" + acc.getQuotaMoney() + "元");

                        } else {
                            acc.setMoney(acc.getMoney() - money);
                            otherAcc.setMoney(otherAcc.getMoney() + money);
                            System.out.println("轉帳成功您的餘額剩餘" + acc.getMoney() + "元");
                            return;
                        }
                    }

                } else {
                    System.out.println("輸入姓氏錯誤");
                }
            }

        }

    }

    // 存錢功能
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("請輸入存款金額");
        double money = sc.nextDouble();
        System.out.println("存入" + money + "元");
        acc.setMoney(acc.getMoney() + money);
        showAccount(acc);
    }

    // 展示帳戶訊息
    private static void showAccount(Account acc) {
        System.out.println("======================當前帳戶訊息如下========================");
        System.out.println("用戶名稱: " + acc.getUserName());
        System.out.println("卡片ID:" + acc.getCardId());
        System.out.println("餘額:" + acc.getMoney());
        System.out.println("單筆轉帳上限:" + acc.getQuotaMoney());

    }

    // 查找功能，由輸入的字串查找accounts內Account的cardId，返回Account
    public static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {

        for (int i = 0; i < accounts.size(); i++) {
            Account ac = accounts.get(i);
            if (ac.getCardId().equals(cardId)) {
                return ac;
            }

        }
        return null;// 查無帳戶
    }

}
