package models;
import models.Person;

import java.util.ArrayList;


public class User extends Person {

    private static long userId ;
    private String dateOfJoin ;
    private String emailId ;
    // constructor
    public User (String name , int age , long phoneNo  , String emailId , String dateOfJoin){
        super(name,age,phoneNo);
        userId = ++userId;
        this. dateOfJoin =dateOfJoin;
        this.emailId =emailId;
    }
    // setter
    public void addUser (String name , int age , long phoneNo  , String emailId , String dateOfJoin){

        super.addPerson(name,age,phoneNo);
        userId = ++userId;
        this. dateOfJoin =dateOfJoin;
        this.emailId =emailId;
    }

    // getter
    public String getuserEmail () {  return emailId;}
    public String getuserDateofjoin () {  return dateOfJoin;}

    public ArrayList<String> getUserDetails (){

        ArrayList<String> details = new ArrayList<>();

        details.add(String.valueOf(this.userId));
        details.add(super.getName());
        details.add(String.valueOf(super.getage()));
        details.add(String.valueOf(super.getphoneNo()));
        details.add(String.valueOf(this.emailId));

        return details;
    }

}
