
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // int[] grades = new int[]{70,80,90,100};
        // System.out.println("陣列長度" + grades.length);
        // // grades[0] = 70;
        // // grades[1] = 80;
        // // grades[2] = 90;
        // System.out.println(grades);
        // for (int i = 0; i < grades.length; i++) {
        // System.out.println(grades[i]);
        // }
        // System.out.println("有幾位學生");
        // Scanner s = new Scanner(System.in);
        // int student = s.nextInt();
        // int[] grades = new int[student];

        // for (int i = 0; i < grades.length; i++) {
        // System.out.println("請輸入下一位學生的成績:");
        // grades[i] = s.nextInt();

        // }
        // int total = 0;
        // for (int i = 0; i < grades.length; i++) {
        // System.out.println("第" + (i+1) + "位學生的成績:" + grades[i]);
        // total += grades[i];
        // }

        // int avg = total / grades.length;
        // System.out.println("平均成績:" + avg);
        //深淺拷貝
        int[] arr1 = { 11, 22, 33 };
        int []arr2=arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        arr2[1]=99;
        System.out.println(arr1[1]);
        System.out.println(arr2[1]);

    }

}
