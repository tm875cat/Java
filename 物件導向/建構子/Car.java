package 物件導向.建構子;

public class Car {// 宣告類別
    String name;//宣告初始屬性(沒給值，預設為null)
    double price;//宣告初始屬性(沒給值，預設為0.0)

    public Car() {// 定義建構子Car並且是無參數的
        System.out.println("無參數建構子被執行");
    }

    public Car(String n ,double p){//有參數建構子
          System.out.println("有參數建構子被執行");
        name=n;
        price=p;
    }



    
}
