package 常用類別.ArrayList.ArrayList元素搜索;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("222201", "無與民", 18, "一班"));
        students.add(new Students("222202", "大狗", 18, "二班"));
        students.add(new Students("222203", "來福", 18, "三班"));
        students.add(new Students("222204", "旺財", 18, "四班"));
        for (int i = 0; i < students.size(); i++) {
            Students s = students.get(i);
            System.out.println(s.getName());
            System.out.println(s.getStudentId());
            System.out.println(s.getAge());
            System.out.println(s.getClassName());
            System.out.println("----------------------");
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("輸入要查找的學號");
            String id = sc.next();
            if (getStudentsById(students, id) != null) {
                System.out.println("學生是" + getStudentsById(students, id).getName());
                break;
            } else {
                System.out.println("查無此人");
            }

        }

    }

    public static Students getStudentsById(ArrayList<Students> students, String studentId) {
        for (int i = 0; i < students.size(); i++) {
            Students s = students.get(i);
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }

        return null;// 無此學號
    }
}
