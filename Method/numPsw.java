package Method;

import java.util.Scanner;

//數字加密
public class numPsw {
    // 輸入密碼長度
    public static void main(String[] args) {
        System.out.println("輸入密碼長度");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        // 輸入密碼
        for (int i = 0; i < arr.length; i++) {
            System.out.println("輸入第" + (i + 1) + "個密碼");
            int number = sc.nextInt();
            arr[i] = number;
        }
        System.out.println("密碼為");
        printArr(arr);// 打印

        // 加密元數字加5並對10求餘然後反轉陣列
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        //
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        System.out.println("加密後密碼");
        printArr(arr);

    }

    public static void printArr(int[] arr) {

   
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");// 條件運算子 如果不是陣列最後一個值就+逗號

        }
        System.out.print("]");
    }
}
