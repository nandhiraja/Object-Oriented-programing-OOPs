package Services;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Movie;
import Models.MovieShows;
import Services.MoviesHandler;

class ShowHandler {
    private   ArrayList<MovieShows>   showList   =  new ArrayList<>();
    Scanner sc =  new Scanner(System.in);


    public void addMovieInShow(MoviesHandler handler){
                
        System.out.println("Enter MovieId :");
        int movieId = sc.nextInt();  

        Movie movie = getMovie(movieId,handler);
        if(movie!=null){
                System.out.println("Movie Id : "+ movieId + " | Movie Name : "+movie.getName());
                System.out.println("Enter showDate  :");        
                String showDate =  sc.next();

                System.out.println("Enter show time :");
                String showTime  =  sc.next();

                System.out.println("Enter screen Number");
                int screenNumber =  sc.nextInt();

                System.out.println("Enter number of seats available");
                int availabelSeat =  sc.nextInt();

                System.out.println("Enter number of Price ");
                int price =  sc.nextInt();

                MovieShows newShow = new MovieShows(movie,showTime, showDate,screenNumber ,availabelSeat, price);
                showList.add(newShow);
        
               System.out.println("New Show added done ");
        }
        else{
            System.out.println("Movie Id Not exist in list, add movie first");
        }
    }




    private Movie getMovie (int movieId , MoviesHandler handler){

            for(Movie movie : handler.getMovieList()){
                if(movie.getMovieId() == movieId)    return movie;
            }
            return null;
    }
   

    public  void viewAllShows() {
         if (showList.isEmpty()) {
             System.out.println("No shows available.");
             return;
         }

          for (MovieShows show : showList) {
               show.showDetails();
     }
}

}