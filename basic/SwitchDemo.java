public class SwitchDemo {
    public static void main(String[] args) {
        int mouth = 10;
        switch (mouth) {
            // 利用break的截斷性省代碼
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("本月有31天");
                break;
            case 2:
                System.out.println("29天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            default:
                System.out.println("輸入有效值");
        }
    }
}
