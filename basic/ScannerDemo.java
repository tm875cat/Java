
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 獲得掃描器對象
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入您的年齡");
        // 下面這行會等待User輸入數據
        int age = sc.nextInt();//nextInt拿到int數據
        System.out.println("年齡"+age);
        System.out.println("輸入姓名");
        String name =sc.next();
        System.out.println( "姓名"+name);
    }
}
