package services.notification;

import models.MovieShows;

public class ShowNotificationImpl implements NotificationService {

    public void whatsAppNotification(MovieShows showDetails){
        System.out.println("Hey! Hurry up ! New Movie is updated \n Name of Movie :"+ showDetails.getMovie());
        System.out.println("Seats Availalable : " +showDetails.getAvailableSeat());
    }
    
    public void webNotification(MovieShows showDetails){
        System.out.println("Hey! Hurry up ! New Movie is updated \n Name of Movie :"+ showDetails.getMovie());
        System.out.println("Seats Availalable : " +showDetails.getAvailableSeat());
    }
    

    public void whatsAppAlertNotification(MovieShows showDetails){
        System.out.println("Hey! Hurry up ! Seats are booking  faster \n Name of Movie :"+ showDetails.getMovie());
        System.out.println("Seats Availalable : " +showDetails.getAvailableSeat());
    }
      public void webAlertNotification(MovieShows showDetails){
        System.out.println("Hey! Hurry up ! Seats are booking  faster \n Name of Movie :"+ showDetails.getMovie());
        System.out.println("Seats Availalable : " +showDetails.getAvailableSeat());
    }
    
}
