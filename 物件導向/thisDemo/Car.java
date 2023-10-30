package 物件導向.thisDemo;

public class Car {
    String name;
    double price;

    public Car(String name, double price) {
        // name傳入奔馳,price傳入80
        // name = name;//會把奔馳傅值給區域變數的name(也就是奔馳=奔馳)
        // price = price;//同上
        this.name=name;//this.name指向類別內的name因此能正確傅值
        this.price=price;
    }
    public void goWith(String name){
        System.out.println(this.name+"正在和"+name+"比賽");
    }

}
