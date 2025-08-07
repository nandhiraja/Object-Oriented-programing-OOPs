package models;

public class Booking {
    private static int id=1;
    private final int bookingID;
    private final int userID;
    private final int movieId;
    private final int seatID;
    private final String paymentId;
    private final String bookingDate;
    private final String showDate;


    public Booking(int userID,int movieId ,int seatID,String paymentId, String bookingDate,String showDate) {
        this.bookingID =id++;
        this.movieId =movieId;
        this.userID=userID;
        this.seatID =seatID;
        this.paymentId =paymentId;
        this.bookingDate=bookingDate;
        this.showDate=showDate;
    }
    public int getBookingID(){
        return this.bookingID;
    }
    public int getuserID(){
        return this.userID;
    }
    public int getMovieId(){
        return this.movieId;
    }
    public String getPaymentId(){
        return this.paymentId;
    }
    public int getSeatId(){
        return this.seatID;
    }
    public String getShowDate(){
        return this.showDate;
    }
      public String getregisterDate(){
        return this.bookingDate;
    }

}
