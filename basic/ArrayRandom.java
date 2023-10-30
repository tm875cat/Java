import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {
        // 輸入一組工號 ，隨機打亂順序
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {// 輸入工號
            System.out.println("輸入第" + (i + 1) + "位的工號");
            int code = sc.nextInt();
            codes[i] = code;
        }
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
    for (int i = 0; i < codes.length; i++) {
        System.out.println(codes[i]+"\t");
        }

    }
}
