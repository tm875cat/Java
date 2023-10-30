package 常用類別.String;

import java.util.Scanner;

public class String內容比較 {
    public static void main(String[] args) {
        // 內容比較
        String okAccount = "zxcv";
        String okPassword = "123";
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入帳號");
        String account = sc.next();
        System.out.println("輸入密碼");
        String psw = sc.next();
        if (okAccount.equals(account) && okPassword.equals(psw)) {
            System.out.println("登入成功");
        } else {
            System.out.println("登入失敗");
        }
    }
}
