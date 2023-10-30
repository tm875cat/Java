package Method;

import java.util.Scanner;

public class 評審打分 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("請輸入第" + (i+1) + "位評委的分數");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            sum += scores[i];
        }
        sum = (sum - max - min) / (scores.length - 2);
        System.out.println(sum);
    }

}
