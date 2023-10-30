package 常用類別.String;

import java.util.Scanner;

public class 手機號碼屏蔽 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("請輸入您的手機號碼:");
        String tel =sc.next();
        String before =tel.substring(0, 3);
        String after=tel.substring(6);
        String s=before+"****"+after;
        System.out.println(s);
    }
}
