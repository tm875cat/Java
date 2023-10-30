package Method;

public class BasicMethod {
    public static void main(String[] args) {
        int arr[] = { 99, 55, 33, 77, 66, 22 };
        int c1 = sum(10, 30);
        System.out.println(c1);
        print();
        System.out.println(getArrayMax(arr));
        System.out.println("-----------------");
        arrayf(arr);
    }

    public static int sum(int a, int b) {// 有傳入值 有傳回值
        int c = a + b;
        return c;
    }

    public static void print() {// 無傳入值無返回值
        for (int i = 0; i < 3; i++) {
            System.out.println("ssss");
        }
    }

    public static int getArrayMax(int[] arr) {// 返回陣列最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // 55 66 33 44 11
    // 55 33 44 11 66
    // 33 44 11 55 66

    public static void arrayf(int[] arr1) {// 陣列排序
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length-i; j++) {
                if (arr1[j] > arr1[j + 1]) { 
                    int c = arr1[j + 1];
                    arr1[j+1]=arr1[j];
                    arr1[j]=c;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
              System.out.println(arr1[i]);
        }
      
      
    }

}
