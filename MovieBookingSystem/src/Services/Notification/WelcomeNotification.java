package Services.Notification;

import Models.User;
import Services.MoviesHandler;

class WelcomeNotification implements NotificationService{

        public void whatsAppNotification(User user ,MoviesHandler handler) {

        System.out.println("Welcome Mr/Mrs :"+ user.getName());
        handler.viewAllShows();
    }
        public void webNotification(User user ,MoviesHandler handler) {

        System.out.println("Welcome Mr/Mrs :"+ user.getName());
        handler.viewAllShows();
    }
    

}
    
