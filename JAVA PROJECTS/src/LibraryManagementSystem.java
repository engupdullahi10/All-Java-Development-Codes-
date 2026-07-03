import java.util.ArrayList;
import java.util.Scanner;
// Book class representing each book record
class Book {
    String title;
    String borrowerName;
    String studentId;
    boolean isBorrowed;
    int fine;
    // Constructor
    public Book(String title, String borrowerName, String studentId) {
        this.title = title;
        this.borrowerName = borrowerName;
        this.studentId = studentId;
        this.isBorrowed = true;
        this.fine = 0;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>(); // Store all borrowed books

        System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM");

        int choice;
        do {
            // Menu
            System.out.println("Library Menu");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    // Borrow Book
                    System.out.print("Enter your name: ");
                    String borrowerName = input.nextLine();
                    System.out.print("Enter your Student ID: ");
                    String studentId = input.nextLine();
                    System.out.print("Enter the book title: ");
                    String bookTitle = input.nextLine();

                    // Create a new Book object
                    Book borrowedBook = new Book(bookTitle, borrowerName, studentId);
                    library.add(borrowedBook);

                    System.out.println("Book borrowed successfully!");
                    break;

                case 2:
                    // Return Book
                    System.out.print("Enter your Student ID: ");
                    String returnId = input.nextLine();
                    System.out.print("Enter the book title: ");
                    String returnTitle = input.nextLine();

                    boolean found = false;
                    for (Book b : library) {
                        if (b.studentId.equals(returnId) && b.title.equalsIgnoreCase(returnTitle) && b.isBorrowed) {
                            found = true;
                            System.out.print("Enter how many days late the book was returned: ");
                            int daysLate = input.nextInt();
                            input.nextLine(); // consume newline

                            // Fine calculation
                            if (daysLate <= 0) {
                                b.fine = 0;
                            } else if (daysLate <= 5) {
                                b.fine = daysLate * 20;
                            } else {
                                b.fine = (5 * 20) + ((daysLate - 5) * 50);
                            }

                            b.isBorrowed = false; // Mark as returned
                            System.out.println("Book returned successfully! Fine: Rs. " + b.fine);
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("No record found for this student and book.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the Library System. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        // Summary of all transactions
        System.out.println("Library Management System Summary");
        for (Book b : library) {
            System.out.println("Book: " + b.title + ", Borrower: " + b.borrowerName +
                    ", Student ID: " + b.studentId +
                    ", Returned: " + (!b.isBorrowed ? "Yes" : "No") +
                    ", Fine: Rs. " + b.fine);
        }

        input.close();
    }
}
