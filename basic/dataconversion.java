public class dataconversion {//型別轉換
    public static void main(String[] args) {
        // 數字小範圍轉大範圍會自動轉
        byte x = 3;
        int y = x;
        System.out.println(y);
        // 大範圍轉小範圍
        int a = 1024;
        byte b = (byte) a;
        System.out.println(b);
        // 字串轉數字
        String c = "222";
        Integer.parseInt(c);
        System.out.println(c);
        // 數字轉字串
        int d = 34;
        String e = String.valueOf(d);
        System.out.println(e);
    }
}
