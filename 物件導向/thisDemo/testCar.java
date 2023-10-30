package 物件導向.thisDemo;

public class testCar {
    public static void main(String[] args) {
        Car c=new Car("奔馳", 80);
        System.out.println(c.name);
        c.goWith("馬自達");
    }
}
