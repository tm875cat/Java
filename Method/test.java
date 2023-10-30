package Method;

public class test {
    // public static void main(String[] args) {
    //     int a = 10;
    //     change(a);
    //     System.out.println(a);
    // }

    // public static void change(int a) {
    //     System.out.println(a);// 10
    //     a = 20;

    // }
    public static void main(String[] args) {
        int[] arrs={10,20,30};
        changeArr(arrs);
        System.out.println("方法執行後"+arrs[1]);//222

    }
    public static void changeArr(int[] arrs){
        System.out.println("方法執行前"+arrs[1]);//20
        arrs[1]=222;
    }
  
}
