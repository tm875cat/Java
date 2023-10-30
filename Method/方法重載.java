package Method;

public class 方法重載 {
    public static void main(String[] args) {
        fire();
        fire("支那",2 );
        
    }
    public static void fire(){//無指定參數
        System.out.println("發射武器給中國");
    }
       public static void fire(String location){//傳入一個參數 字串
        System.out.println("發射"+1+"枚飛彈給"+location);
    }
    public static void fire(String location,int num){//傳入兩個參數 字串, 數值
        System.out.println("發射"+num+"枚飛彈給"+location);
    }
}
