package 物件導向.建構子;

public class testCar {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);
        System.out.println(c.price);

        Car c1 = new Car("奔馳", 80);
        System.out.println(c1.name);
        System.out.println(c1.price);

    }
}
