package Models;

public class MovieShows {
    private static int nextId = 1;  

    private final int showId;
    private final Movie movie;          
    private final String showTime;      
    private final String showDate;   
    private final int screenNumber;  
    private  int  availabelSeat;    
    private final int price;
   

   
    public MovieShows(Movie movie, String showTime, String showDate,int screenNumber, int availabelSeat ,int price) {
        this.showId = nextId++;
        this.movie = movie;
        this.showTime = showTime;
        this.screenNumber = screenNumber;
        this.showDate = showDate;
        this.availabelSeat = availabelSeat;
        this.price =price;
    }

   
    public int getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getShowTime() {
        return showTime;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public String getShowDate() {
        return showDate;
    }

    public int getAvailabelSeat() {
        return availabelSeat;
    }
      public int getShowPrice() {
        return price;
    }
    public void  setAvailableSeat(int seatBooked){
        this.availabelSeat -= seatBooked;
    }



    public void showDetails() {
        System.out.println("------------ Movie Show Details -------------");

        System.out.println("Show ID: " + showId);
        System.out.println("Movie Name: " + movie.getName()); 
        System.out.println("Screen: " + screenNumber);
        System.out.println("Show Date: " + showDate);
        System.out.println("Show Time: " + showTime);
        System.out.println("Available seats: " + availabelSeat);
        System.out.println("Price  Rs : " + price);




        System.out.println("---------------------------------------------");
    }
}
