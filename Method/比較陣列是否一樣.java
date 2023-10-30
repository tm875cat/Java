package Method;

public class 比較陣列是否一樣 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        System.out.println(compare(arr1, arr2));

    }

    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length < 1 || arr2.length < 1 || arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
