package Method;

public class 找質數 {// 找出質數
    public static void main(String[] args) {
        for (int i = 101; i < 200; i++) {// 找出1到200的質數
            // 標記i是否是質數
            boolean flag = true;// 所有數字都先當質數
            for (int j = 2; j <= i /2; j++) {
                if (i % j == 0) {
                    flag = false;// 若找到能整除的數字將flag標記為false
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i);
            }

        }
    }
}
