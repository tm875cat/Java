public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 1, 6 };
        // for (int i = 1; i < arr.length; i++) {// 控制陣列需要比較幾次
        //     for (int j = 0; j < arr.length - i; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j + 1];
        //             arr[j + 1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

            for (int i = (arr.length-1); i > 0; i--) {// 迴圈用減的寫法
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ",");
        }
    }
}
