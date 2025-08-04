package Services.Notification;

import Models.MovieShows;
import Models.User;


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