package models;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Book {
    private long totalBooks;
    private String bookName ;
    private String author ;
    private static int count ;
    private String catogory ;

    public Book(String bookName , String Author , String category){
        this.bookName =bookName;
        this.author=Author;
        this.catogory = category;
    }
    public void book (String bookName ,String author ,String category ,int stock){
        this.bookName =bookName;
        this.author=author;
        this.catogory = category;
        this.count = stock;
        totalBooks +=stock;
    }

    public void addBook (int  count){
        this.count = count;
        totalBooks+=count;
    }

    public void lendBooks(int count){
        this.count -=count;
        totalBooks -=count;

    }

    public int getBookCount(){
        return this.count;
    }
    public ArrayList<String> Details (){

        ArrayList<String> details = new ArrayList<>();

        details.add(String.valueOf(this.bookName));
        details.add(this.catogory);
        details.add(this.author);
        details.add(String.valueOf(this.count));

        return details;
    }

}
