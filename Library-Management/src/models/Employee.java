package models;
import models.Person;

import java.util.ArrayList;


public class Employee extends Person {

    private static long employeeId ;
    private String dateOfJoin ;
    private String emailId ;
    private String role;
    // constructor
    public Employee (String name , int age , long phoneNo  , String emailId , String dateOfJoin ,String role){
        super(name,age,phoneNo);
        employeeId = ++employeeId;
        this. dateOfJoin =dateOfJoin;
        this.emailId =emailId;
        this.role = role;
    }
    // setter
    public void addUser (String name , int age , long phoneNo  , String emailId , String dateOfJoin ,String role){

        super.addPerson(name,age,phoneNo);
        employeeId = ++employeeId;
        this. dateOfJoin =dateOfJoin;
        this.emailId =emailId;
        this.role = role;
    }

    // getter
    public String getEmployeeEmail () {  return this.emailId;}
    public String getEmployeeDateofjoin () {  return this.dateOfJoin;}
    public String getEmployee () { return this.role;}

    public ArrayList<String> getEmployeeDetails (){

        ArrayList<String> details = new ArrayList<>();

        details.add(String.valueOf(this.employeeId));
        details.add(super.getName());
        details.add(String.valueOf(super.getage()));
        details.add(String.valueOf(super.getphoneNo()));
        details.add(String.valueOf(this.emailId));
        details.add(this.role);

        return details;
    }

}
