package models;

public class Person {

    private String name ;
    private int age;
    private long phoneNo;

   // constructor
    public Person(String name ,int age, long phoneNo){
        this.name = name ;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    // setter method
    public void addPerson (String name ,int age, long phoneNo){
        this.name = name ;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    // getter methods
    public String getName(){return this.name; }
    public int getage(){return this.age;}
    public long getphoneNo(){return this.phoneNo;}
}
