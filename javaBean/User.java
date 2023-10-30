package javaBean;

public class User {
    private String name;// 聲明為 private 時，它將僅在該類別內部可訪問，而無法在該類別之外直接訪問
    private double height;
    private char sex;
    private int age;

    public User() {// 預設就有無參數建構子所以可以不寫，但如果有寫有參數建構子就要寫出來了
    } 

    public User(String name, double height, char sex, int age) {//有參數建構子
        this.name = name;
        this.height = height;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
