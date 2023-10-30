package Method;

public class 陣列排序 {
    public static void main(String[] args) {
        int[] arr = { 90, 4, 8, 61, 4, 6 };
        sort(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length ? arr[i] : arr[i] + ",");
        }
        System.out.print("]");
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {// 定義迴圈控制比較的輪數第一輪的話比較次數最多並依序減少
            // i==1第1輪比較的次數=陣列長度-1 j=0 1 2
            // i==2第2輪比較的次數=陣列長度-2 j =0 1
            // i==3第3輪比較的次數=陣列長度-2 j =0
            // 定義一個迴圈控制比較的次數
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int c = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = c;
                }
            }

        }

    }
}
