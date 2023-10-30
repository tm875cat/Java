package 常用類別.String;

import java.util.Scanner;

public class 登入功能 {
    public static void main(String[] args) {
        String okAccount = "admin";
        String okPsw = "123";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("輸入帳號");
            String account = sc.next();
            System.out.println("輸入密碼");
            String psw = sc.next();
            if (okAccount.equals(account)) {
                if (okPsw.equals(psw)) {
                    System.out.println("登入成功");
                    break;
                } else {
                    System.out.println("密碼錯誤");
                    System.out.println("您還剩" + (3 - i) + "次機會");
                }
            } else {
                System.out.println("帳號錯誤");
                System.out.println("您還剩" + (3 - i) + "次機會");
            }
        }
    }
}
