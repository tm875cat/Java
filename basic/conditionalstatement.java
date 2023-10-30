import java.util.Scanner;//引入Scanner類別

public class conditionalstatement {// 判斷式
    public static void main(String[] args) {
        // 使用標準輸入
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入提款金額:");
        int number = s.nextInt();
        // if 判斷式

        if (number > 10000) {
            System.out.println("禁止提領超過10萬");
        } else if (number < 100) {
            System.out.println("請輸入100以上的金額");
        } else {
            System.out.println("提款成功");
        }

        // switch判斷式
        int n1 = 3;
        int n2 = 4;
        Scanner b = new Scanner(System.in);
        System.out.println("請輸入 + - * /");
        String op = b.next();
        System.out.println("進行的運算");
        System.out.println(op);
        switch (op) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;
            default:
             System.out.println("請輸入有效運算符號");
                break;
        }
    }
}