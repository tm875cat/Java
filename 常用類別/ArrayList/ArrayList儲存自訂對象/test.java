package 常用類別.ArrayList.ArrayList儲存自訂對象;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("逃學威龍", 9.7, "周星馳"));
        movies.add(new Movie("少林足球", 8.8, "周星馳"));
        movies.add(new Movie("功夫", 6.7, "周星馳"));
        System.out.println(movies);// 裝的是對象地址
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("片名" + movie.getName());
            System.out.println("評分" + movie.getScore());
            System.out.println("演員" + movie.getActor());
        }
    }
}
