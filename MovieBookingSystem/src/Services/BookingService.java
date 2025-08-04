package Services;

import Models.MovieShows;
import Models.Payment;
import Models.User;
import Services.PaymentService.PaymentGateWay;
import java.util.Date;

import java.util.Scanner;

public class BookingService {
       private static int id;
       private static int paymentId;
       Scanner sc =  new Scanner(System.in);

    public boolean bookMyTicket(User user ,MovieShows show){

        System.out.println("Hello "+user.getName() + "you are booking a ticket for "+show.getMovie().getName());
        System.out.println("Price : "+show.getShowPrice());
        float amount =  sc.nextFloat();
        if(amount == show.getShowPrice()){
            System.out.println("Enter paymentMethod :( Gpay or Paytm )");
            String  method =  sc.next();
            Object date =new Date();
            Payment paymet = new Payment( method , "transactionId2", "april" ,  amount );
            boolean respond = new PaymentGateWay().payAmount(paymet);
    

            show.setAvailableSeat(-1);
            return respond;


        }   
        else {
            System.out.println("Enter Valid amount");
            return false;
        }     

    }
   
}
