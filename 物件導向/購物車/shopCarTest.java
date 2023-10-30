package 物件導向.購物車;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class shopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];// 定義購物車物件為陣列裡面目前每個項目都是null
        boolean choose = true;
        while (choose) {
            System.out.println("請選擇以下命令進行操作");
            System.out.println("添加商品到購物車:add");
            System.out.println("查詢購物車商品:search");
            System.out.println("修改購物車商品:update");
            System.out.println("結算購物車商品:pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入命令:");
            String command = sc.next();
            switch (command) {
                case "add":
                    add(shopCar, sc);
                    break;
                case "search":
                    search(shopCar);
                    choose = false;
                    break;
                case "update":
                    update(shopCar, sc);
                    choose = false;
                    break;
                case "pay":
                    pay(shopCar);
                    choose = false;
                    break;
                default:
                    System.out.println("沒有該功能");
            }
        }
    }

    public static void add(Goods[] shopCar, Scanner sc) {
        // 模擬所以讓user自己輸入商品訊息
        System.out.println("請輸入購買商品的編號:");
        int id = sc.nextInt();
        System.out.println("請輸入商品名稱");
        String name = sc.next();
        System.out.println("請輸入商品數量");
        int quantity = sc.nextInt();
        System.out.println("請輸入商品價格");
        double price = sc.nextDouble();
        // 將這些商品訊息封裝成商品物件
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.quantity = quantity;
        g.price = price;
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }
    }

    public static void update(Goods[] shopCar, Scanner sc) {
        // 讓User輸入商品ID，根據ID查詢商品對象
        while (true) {
            System.out.println("請輸入要修改的商品ID:");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if (g == null && id != 0) {
                System.out.println("沒有該商品，請重新輸入，或輸入0取消修改");
            } else if (id == 0) {
                System.out.println("取消修改");
                break;
            }

            else {
                System.out.println("請輸入" + g.name + "欲修改的購買數量");
                int buyquantity = sc.nextInt();
                g.quantity = buyquantity;
                System.out.println("修改完成");
                search(shopCar);
                break;
            }

        }

    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        // 用輸入的ID來查找對應商品，返回商品物件
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                if (g.id == id) {
                    return g;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public static void search(Goods[] shopCar) {
        // 查詢並展示購物車內的商品
        System.out.println("商品ID\t\t商品名稱\t\t數量\t\t價格");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println(g.id + "\t\t" + g.name + "\t\t\t" + g.quantity + "\t\t" + g.price);

            } else {
                break;
            }
        }
    }

    public static void pay(Goods[] shopCar) {
        search(shopCar);
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                money += (g.price * g.quantity);
            } else {
                break;
            }
        }
        System.out.println("訂單總金額:" + money);
    }
}
