package Services;
import java.util.ArrayList;
import java.util.Scanner;
 

import Models.User;

public class userService {
    Scanner sc =  new Scanner(System.in);
    private ArrayList<User> UserData =  new ArrayList<>();


    public void addUser(){
        System.out.println("Enter user Name : ");
        String userName =  sc.nextLine();
        System.out.println("Enter PhoneNo : ");
        String userPhoneNo =  sc.nextLine();
        System.out.println("Enter Address : ");
        String userAddress =  sc.nextLine();

        User newUser =  new User(userName,userAddress,userPhoneNo);

       
      
    }
    
    
}
