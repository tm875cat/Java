import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int lucky = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("幸運號碼:" + lucky);

        while (true) {
            System.out.println("輸入幸運號碼");
            int guess = sc.nextInt();

            if (guess == lucky) {
                System.out.println("猜對了");
                break;
            } else if (guess > lucky) {
                System.out.println("猜得太大");
            } else if (guess < lucky) {
                System.out.println("猜得太小");
            }
        }
    }
}
