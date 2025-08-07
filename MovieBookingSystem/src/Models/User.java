package Models;

public class User {
    private static int id =1;

    public static void setId(int id) {
        User.id = id;
    }
    private int userId;
    private String name;
    private String address;
    private String phoneNO;


// setter

    public User(String name, String address, String phoneNo) {
        this.userId = id++;
        this.name = name;
        this.address = address;
        this.phoneNO = phoneNo;
    }

    // getters
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNO(){
        return this.phoneNO;
    }
    public int getUserId(){
        return this.userId;
    }
    


   
    public void showUser(){
     System.out.println("---------------User Details-------------------");
     System.out.println("userId : "+this.userId);
     System.out.println("Name : " +this.name);
     System.out.println("Address :"+this.address);
     System.out.println("MobileNo : "+this.phoneNO);

    System.out.println("------------------------------------------------");


    }

    

    
}
