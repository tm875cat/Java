package 常用類別.String;

public class StringApi {
    public static void main(String[] args) {
        String StringText = "NMSLNMSL";
        System.out.println(StringText.length());// 獲取字串長度
        char c = StringText.charAt(5);// 獲取某個位置的字元
        char[] c1 = StringText.toCharArray();// 字串轉成字元陣列

        String StringText2 = "Java讚讚NMSL";
        System.out.println(StringText2.substring(0, 4)); // 擷取字串內容

        String StringText3 = "NMSL無與民NMSL";
        System.out.println(StringText3.replace("NMSL", "****"));// 字串替換，把左邊變數的內容替換為右邊變數
        System.out.println(StringText3.contains("NMSL")); // 檢查字串內是否包含某些內容，返回布林值
        System.out.println(StringText3.startsWith("NMSL")); // 檢查字串是否由指定內容開始
        String StringText4 = "一號,二號,三號";
        String[]s= StringText4.split(",");//將字串分割成同一陣列中的不同元素，以變數為分割點
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
