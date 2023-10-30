package Method;

public class 陣列複製 {
    public static void main(String[] args) {
        int arr1[] = { 11, 22, 33 };
        int arr2[] = { 88, 88, 88 };
        printArray(arr1, arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

    public static void printArray(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

    }
}
