package 常用類別.String;

import java.util.Random;

public class String驗證碼 {
    public static void main(String[] args) {
        String dates = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";// 把大小寫A到Z及0到9存到dates裡
        Random r = new Random();
        String code="";
        for (int i = 0; i < 5; i++) {
           int index= r.nextInt(dates.length());//隨機一個索引值
            char c =dates.charAt(index);
            code+=c;
        }
        System.out.println(code);
    }
}
