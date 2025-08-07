package models;

public class Movie {
    private static int id=1 ;
    private final int movieId;
    private final String name;
    private final String releaseDate;
    private final float rating;

    // Setter

    public Movie(String name,float rating,String date) {
        this.movieId = id++; 
        this.name = name;
        this.releaseDate = date;
        this.rating =  rating;
    }
    
    
    // getters
    public String getName(){
        return this.name;
    }
    public String getReleaseDate(){
        return this.releaseDate;
    }
    public float getRating(){
        return this.rating;
    }
    public int getMovieId(){
        return this.movieId;
    }

 
  
    public void showDetails(){
     System.out.println("---------------Movie Details-------------------");
     System.out.println("MovieId : "+this.movieId);
     System.out.println("Name : " +this.name);
     System.out.println("ReleaseDate :"+this.releaseDate);
     System.out.println("Rating  : "+this.rating);

    System.out.println("------------------------------------------------");


    }


}
