import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        // 生成0-9
        int data = r.nextInt(10);
        System.out.println(data);

        // System.out.println("------------------");
        // // 生成區間隨機數
        // // 生成3-17
        // for (int i = 0; i < 20; i++) {
        // int rdata = r.nextInt(15) + 3;
        // System.out.println(rdata);
        // }
        // System.out.println("------------------");
        
        // // 生成65-91
        // for (int i = 0; i < 20; i++) {
        //     int data3 = r.nextInt(27) + 65;
        //     System.out.println(data3);
        // }

    }
}
