package Method;

public class 印出陣列 {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44 };
        printarr(arr);
    }
    public static void printarr(int[] arr) {
        System.out.print("[");
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
