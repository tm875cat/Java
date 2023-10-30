import java.util.Scanner;

public class loopstatement {// 迴圈指令
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;// 回到迴圈開始的地方(i不會重制)
            }
            System.out.println(i);
        }
        Scanner s = new Scanner(System.in);

        int number;
        while (true) {
            System.out.println("請輸入一個正整數");
            number = s.nextInt();
            if (number > 0) {
                System.out.println("輸入正確");
                break;
            } else {
                System.out.println("輸入錯誤，請重新輸入");
  
            }
        }

    }
}
