// Movie Booking System: App Entry Point
//    javac -cp ./src -d . src/Models/*.java src/Services/*.java App.java
import Models.Movie;
import Models.User;
import java.util.ArrayList;
import java.util.List;
import Services.userService;

public class App {

    public static void main(String[] args) {

        userService user =  new userService();
        user.addUser();


        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Interstellar", 4.8f, "2014-11-07"));
        movies.add(new Movie("Inception", 4.7f, "2010-07-16"));
        movies.add(new Movie("The Dark Knight", 4.9f, "2008-07-18"));
        movies.add(new Movie("Dune", 4.4f, "2021-10-22"));
        movies.add(new Movie("Avatar", 4.5f, "2009-12-18"));


        System.out.println("\n========== Available Movies ==========");
        for (Movie movie : movies) {
            movie.showDetails();
        }
    }
}
