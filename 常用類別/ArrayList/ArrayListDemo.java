package 常用類別.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");// 新增元素至集合內
        list.add(1, "333");// 有索引值根據索引值位置新增(原本位置的內容往後擠)
        list.add("Vue");
        list.add("MySQL");
        System.out.println(list);
        String e = list.get(2);// 獲取索引值內元素
        System.out.println(e);
        int a = list.size();// 獲取元素大小
        System.out.println("----------------------");
        list.remove("333");// 刪除集合內某元素(只會刪除找到的第一個)
        System.out.println(list);
        list.set(1, "SSSS");//根據索引修改陣列值
        System.out.println(list);

    }
}
