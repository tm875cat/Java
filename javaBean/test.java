package javaBean;

public class test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("無與民");
        u1.setHeight(175);
        u1.setSex('男');
        u1.setAge(25);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSex());
        System.out.println(u1.getAge());

        User u2 = new User("無與民民民", 177, '女', 44);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSex());
        System.out.println(u2.getAge());
    }
}
