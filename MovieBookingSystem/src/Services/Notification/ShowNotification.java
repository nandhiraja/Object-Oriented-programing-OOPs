package Services.Notification;

public class ShowNotification implements NotificationService {

    public void whatsAppNotification(MovieShow showDetails){
        System.out.println("Hey! Hurry up ! New Movie is updated \n Name of Movie :"+ showDetails.getMovie());
        System.out.println("Seats Availalable : " +showDetails.getAvailabelSeat());
    }
    
    public void webNotification(MovieShow showDetails){
        System.out.println("Hey! Hurry up ! New Movie is updated \n Name of Movie :"+ showDetails.getMovie());
        System.out.println("Seats Availalable : " +showDetails.getAvailabelSeat());
    }
    

    public void whatsAppAlertNotification(MovieShow showDetails){
        System.out.println("Hey! Hurry up ! Seats are booking  faster \n Name of Movie :"+ showDetails.getMovie());
        System.out.println("Seats Availalable : " +showDetails.getAvailabelSeat());
    }
      public void webAlertNotification(MovieShow showDetails){
        System.out.println("Hey! Hurry up ! Seats are booking  faster \n Name of Movie :"+ showDetails.getMovie());
        System.out.println("Seats Availalable : " +showDetails.getAvailabelSeat());
    }
    
}
