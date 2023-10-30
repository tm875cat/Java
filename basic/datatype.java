public class datatype {
    public static void main(String[] args) {
        System.out.println(3);
        System.out.println(120);
        System.out.println(20000000000L);
        System.out.println(3.14136135);// 浮點數預設為double(雙精度浮點數)
        System.out.println(3.14136135f);// 加上f後變為float(單精度浮點數)小數點七位數後的會被捨去
        System.out.println(false);
        System.out.println('1');// 單引號為字元輸入2個字會報錯
        System.out.println("2222");// 雙引號為字串可自由輸入0~多個字
        // double x="sdasd";宣告變數需要對應資料型態

        // ++ -- 前後差異
        int i = 10;
        int j = i++;
        System.out.println("i" + i);
        System.out.println("j" + j);

        boolean k = true;
        boolean p = false;
        System.out.println("邏輯"+(k||p));

    }

}