import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        // 聖母峰8848.86m一張紙0.1mm一張紙對折多少次才可高過聖母峰
        double peakHeight = 8848860;
        double paper = 0.1;
        int count = 0;
        while (paper <peakHeight) {
            paper *= 2;
            count++;
        }
            System.out.println("摺疊次數"+count);
            // while(true){
            //     System.out.println("無限迴圈");
            // }
            Scanner sc =new Scanner(System.in);
            int okpsw =123;
            while(true){
              System.out.println("請輸入密碼");
              int psw =sc.nextInt();
              if(psw==okpsw){
                System.out.println("密碼正確");
                break;
              }
              else{
                System.out.println("密碼錯誤");
              }
            }
        

    }
}
