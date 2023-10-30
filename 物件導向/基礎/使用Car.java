package 物件導向.基礎;

public class 使用Car {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "賓士";
        c.price = 10;
        System.out.println(c.name);
        c.start();
        Car c2 =new Car();
        c2.name="TOYOTA"; 
        c2.price=33;
        c2.start();
    }
}
 