public class ForDemo {
    public static void main(String[] args) {
        // 各個位數的立方和等於該數本身體來說，對於一個三位數 abc 來說，如果滿足以下條件，它就是一個水仙花數：
        // abc = a³ + b³ + c³
        // 其中，a、b、c 分別代表該三位數的各個位數。
        // 例如，153 是一個水仙花數，因為：
        // 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

        for (int i = 100; i <= 999; i++) {
            int m = i % 10;// 個位數
            int u = (i / 10) % 10;// 十位數
            int n = i / 100;// 百位數
        
            if(m*m*m+u*u*u+n*n*n==i){
                System.out.println(i);
            }

        }
        //死迴圈
        for(;;){
            System.out.println("無限迴圈");
        }
    }
}