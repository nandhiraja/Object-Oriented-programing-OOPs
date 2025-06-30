import models.Book;
import models.Employee;
import models.Person;
import models.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Naveen" ,21,987656321, "naveen045@gmail.com","30/06/2025");
        User user2 = new User("Santhosh" ,21,784249493, "sandy55@gmail.com","30/06/2025");
        Employee employee1 = new Employee("Nandhi" ,21,987656321, "nandi16@gmail.com","30/06/2025","Admin");
        Book book1 =new Book("python","Naveen","Computer");
        Book book2 =new Book("JAVA","Kumar","Computer");
        Book book3 =new Book("DSA","santhosh","Programming");
        book3.addBook(20);
        book2.addBook(30);
//        System.out.println(employee1.getName());
//        System.out.println(user2.getName());

        System.out.println(employee1.getEmployeeDetails());
        System.out.println(user2.getUserDetails());
        System.out.println(book3.Details());
        System.out.println(book3.getBookCount());
        book3.lendBooks(10);
        System.out.println(book3.Details());
        System.out.println(book3.getBookCount());



    }
}