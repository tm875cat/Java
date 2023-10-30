package Method;
import java.util.Random;

public class 驗證碼 {
    public static void main(String[] args) {// 隨機產生驗證碼 可能是大寫 小寫 數字

        System.out.println(createCode(5));
    }

    public static String createCode(int n) {
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);// 隨機生成0 1 2
            switch (type) {
                case 0:// 大寫字元 用數字65強轉char就是A 往後推25個例如Z就是65+25
                    char big = (char) (r.nextInt(26) + 65);// 生成65-90
                    code += big;
                    break;
                case 1:// 小寫從 97到(97+25)
                    char small = (char) (r.nextInt(26) + 97);
                    code += small;
                    break;
                case 2:
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
