package 物件導向.基礎;//物件導向

public class Car {
    // 屬性 成員變數
    String name;
    double price;

    // 行為(方法)
    public void start() {
        System.out.println(name + "價格是" + price);
    }

    public void run() {
        System.out.println(name + "價格是" + price + "開始跑了");
    }
}
