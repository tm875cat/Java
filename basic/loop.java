public class loop {// 迴圈
    public static void main(String[] args) {
        // while迴圈
        int x = 1;
        int t = 0;
        while (x <= 10) {
            t += x;
            x++;
        }
        System.out.println("1~10"+"="+t);
        // for迴圈
        int total =0;
        for(int i =1;i<=100;i++){

            total+=i;
        }
        System.out.println("0加到100="+total);


    }
}
