// Class Book
class Book{
    private int bookId;
    private String title;
    private  String author;
    private boolean isAvailable;
    private static int totalBook= 0;
    // Deflated construction
    public  Book(){
        this.bookId= 0;
        this.title= "Unknown";
        this.author="Unknown";
        this.isAvailable= true;
        totalBook++;
    }
    // Method Construction
    public Book(int bookId , String title , String author , boolean isAvailable){
        this.bookId= bookId ;
        this.title= title ;
        this.author= author ;
        this.isAvailable= isAvailable;
        totalBook++;
    }
    // Getter & Setter

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    // Borrow BOOk
    public void borrowBook(){
        if (isAvailable){
            isAvailable= false;
            System.out.println(title +" has been borrowed the book.");
        }else {
            System.out.println(title + " is not available");
        }
    }
    // Return BOOk
    public void returnBook(){
        isAvailable=true;
        System.out.println( title + " has been return the book.");
    }
    // Display
    public void displayInfo(){
        System.out.println("\n===Display Information For Library Book====");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Available: " + isAvailable);
    }
    // Total Book
    public static void showTotalBook(){
        System.out.println("\nTotal Book: " + totalBook );
    }
}
public class Task15 {
    // Task 1 Library Management System
    public static void main(String[] args){
        // Create 3 Book Object
        Book book1=new Book(1, "Java " , "Abdullahi" , true);
        Book book2=new Book(2 , "Python" , "Hafsa" , true);
        Book book3=new Book(3 , "C++" , "Zamzam" , true);
        // Display Inform
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        // Borrow BOOk
        book1.borrowBook();
        book2.borrowBook();
        book3.borrowBook();
        // Return Book
        book1.returnBook();
        book2.returnBook();
        book3.returnBook();
        Book.showTotalBook();
    }

}
