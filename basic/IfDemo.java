public class IfDemo {
    public static void main(String[] args) {
        // 心跳60到100是正常的否則，系統提示要進一步檢查
        int heart = 60;
        if (heart < 60 || heart > 100) {
            System.out.println("檢查");
        } else {
            System.out.println("正常");
        }
        // 發紅包(餘額夠才能發)
        double money = 6000;
        double get = 1314;
        if (money > get) {
            System.out.println("發送成功");
        } else {
            System.out.println("餘額不足");
        }




        
    }
}
