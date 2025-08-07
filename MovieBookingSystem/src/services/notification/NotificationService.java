package services.notification;

import models.MovieShows;
import models.User;


interface NotificationService {

    default void notification(){
        System.out.println("sucessfull");
    }
}

interface WellcomeNotification extends NotificationService{
    void showNotify(User user);

}
interface ShowNotification extends NotificationService{
    void showNotify(MovieShows user);

}
