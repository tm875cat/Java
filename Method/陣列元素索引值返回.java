package Method;

public class 陣列元素索引值返回 {
    public static void main(String[] args) {
        int arrs[] = { 1, 2, 3, 3, 4 };
        System.out.println(findIndex(arrs, 2));
    }

    public static int findIndex(int[] arrs, int data) {

        for (int i = 0; i < arrs.length; i++) {
            if (data == arrs[i]) {
                return i;
            }
        }

        return -1;

    }
}
