package Method;

import java.util.Random;

public class randomBall {
    // 樂透號碼球，生成7個不重複的號碼球
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            while (true) {// 無限迴圈，直到號碼球都不重複
                int number = r.nextInt(33) + 1;
                boolean flag = true;// 設定一標記來看是否都不重複 預設為是
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == number) {
                        flag = false;
                        break;// 如果在陣列中找到一樣的數字結束此for迴圈，回到while無限迴圈中
                    }
                }
                if (flag) {// 檢查是否都不重複如果是將號碼放進陣列並結束無限迴圈
                    numbers[i] = number;
                    break;
                }
            }

        }
        printnumbers(numbers);

    }

    public static void printnumbers(int arr[]) {//印出中獎號碼
        System.out.println("中獎號碼為");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(j == arr.length - 1 ? arr[j] : arr[j] + ",");
        }
    }
}
