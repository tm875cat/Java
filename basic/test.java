public class test {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // System.out.println(a > 100 && ++b > 20);
        // System.out.println(b);
        // int i =10;
        // int j =20;
        // System.out.println(i>2||++j>10);
        // System.out.println(i>2);
        // boolean c =true;
        // boolean d =false;
        // System.out.println(c^d);
        // double score = 5;
        // String rs = score >= 60 ? "通過" : "掛科";
        // System.out.println(rs);

        // 找出最大值
        // int i = 10;
        // int j = 30;
        // int k = 50;
        // int temp = i > j ? i : j;
        // int max = temp > k ? temp : k;
        // System.out.println(max);
        // 找出最大值進階寫法
        int i = 10;
        int j = 30;
        int k = 50;
        int max = i > j ? (i > k ? i : k) : (j > k ? j : k);
        System.out.println(max);
    }
}
