package Services;
import Models.Movie;
import Models.MovieShows;

import java.util.*;
public class MoviesHandler {
    
  
    private ArrayList<Movie> movieList  =  new ArrayList<>();

    Scanner sc = new Scanner(System.in);


    public void addMovie (){
        System.out.println("Enter Movie Name : ");
        String movieName =  sc.nextLine();
        System.out.println("When Movie released ? :");
        String relaeseDate =  sc.next();
        System.out.println("Enter Movie rating :");
        float rating =  sc.nextFloat();
       
        Movie newMovie =  new Movie(movieName,rating,relaeseDate);
        movieList.add(newMovie);
        System.out.println(movieName+" Movie add to List with Id : "+ newMovie.getMovieId());

    }

    public  ArrayList<Movie>   getMovieList(){
            return this.movieList;
    }



   

}




