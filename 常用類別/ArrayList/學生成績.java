package 常用類別.ArrayList;

import java.util.ArrayList;

public class 學生成績 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);
        //把低於80的成績從集合刪除
        // for (int i = 0; i < scores.size(); i++) {
        //     int score=scores.get(i);
        //     if(score<80){
        //         scores.remove(i);//刪除後元素會移動所以會出BUG
        //         i--;//刪除完後i-1就不會有問題了
        //     }
        // }
        for (int i = scores.size()-1; i >= 0; i--) {
                    int score=scores.get(i);
            if(score<80){
                scores.remove(i);//倒著移除就不會有BUG
         
            }
        }
        System.out.println(scores);

    }
}
