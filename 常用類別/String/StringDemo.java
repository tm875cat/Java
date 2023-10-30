package 常用類別.String;

public class StringDemo {
    public static void main(String[] args) {
        // 創建字串對象的方式
        String name = "最常用的基本方式";
        // 利用String的建構子的方式
        String s1 = new String();// s1="" 實際開發沒啥在用
        String s2 = new String("123");// s2=123 實際開發沒啥在用
        char[] chars = { 'N', 'M', 'S', 'L' };
        String s3 = new String(chars);// 傳入字元陣列可把她轉為字串，若傳入的是數字也會轉成字元再組成字串
        System.out.println("=============================================");
        String ss1 = "abc";// 以""給出的字串對象相同的內容只會在內存中有一份
        String ss2 = "abc";
        System.out.println(ss1 == ss2);// true 比較的對象是字串儲存的地址
        char[] chars1 = { 'N', 'M', 'S', 'L' };
        String ss3 = new String(chars1);
        String ss4 = new String(chars1);
        System.out.println(ss3 == ss4);//false  比較的對象是字串儲存的地址

    }
}
