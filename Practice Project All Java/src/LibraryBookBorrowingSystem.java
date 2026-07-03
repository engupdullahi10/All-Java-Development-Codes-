import java.util.Scanner;

public class LibraryBookBorrowingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Student ID
        System.out.println("Enter the student's ID: ");
        String studentId = input.nextLine();

        // Step 2: How many books the student wants to borrow
        System.out.println("Enter how many books you want to borrow: ");
        int borrowerBook = input.nextInt();

        // Maximum borrowing limit check
        if (borrowerBook > 5) {
            System.out.println("You cannot borrow more than 5 books!");
            return;
        }

        // Array to store borrowed book names
        String[] borrowed = new String[borrowerBook];
        int count = 0; // Track number of selected books

        int choice;

        // Step 3: Book Selection Menu
        do {
            System.out.println("\n===== Book Selection Menu =====");
            System.out.println("1. Fiction");
            System.out.println("2. Science");
            System.out.println("3. History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 4) {
                System.out.println("Exiting selection menu...");
                break;
            }

            if (count == borrowerBook) {
                System.out.println("You have selected all your books!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Available Fiction Books:");
                    System.out.println("1. The Great Gatsby");
                    System.out.println("2. Harry Potter");
                    System.out.println("3. Pride and Prejudice");
                    System.out.print("Select book number: ");
                    int f = input.nextInt();

                    if (f == 1) borrowed[count++] = "The Great Gatsby";
                    else if (f == 2) borrowed[count++] = "Harry Potter";
                    else if (f == 3) borrowed[count++] = "Pride and Prejudice";
                    else System.out.println("Invalid book!");
                    break;

                case 2:
                    System.out.println("Available Science Books:");
                    System.out.println("1. Physics for Beginners");
                    System.out.println("2. Chemistry Essentials");
                    System.out.println("3. Biology Life on Earth");
                    System.out.print("Select book number: ");
                    int s = input.nextInt();

                    if (s == 1) borrowed[count++] = "Physics for Beginners";
                    else if (s == 2) borrowed[count++] = "Chemistry Essentials";
                    else if (s == 3) borrowed[count++] = "Biology Life on Earth";
                    else System.out.println("Invalid book!");
                    break;

                case 3:
                    System.out.println("Available History Books:");
                    System.out.println("1. World War II");
                    System.out.println("2. History of Pakistan");
                    System.out.println("3. Ancient Civilizations");
                    System.out.print("Select book number: ");
                    int h = input.nextInt();

                    if (h == 1) borrowed[count++] = "World War II";
                    else if (h == 2) borrowed[count++] = "History of Pakistan";
                    else if (h == 3) borrowed[count++] = "Ancient Civilizations";
                    else System.out.println("Invalid book!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 4 && count < borrowerBook);

        // Step 4: Display Summary of Borrowed Books
        System.out.println("\n===== Borrowing Summary =====");
        System.out.println("Student ID: " + studentId);
        System.out.println("Books Borrowed:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + borrowed[i]);
        }

        System.out.println("Total Books Borrowed: " + count);
        System.out.println("Thank you! Your borrowing process is complete.");
    }
}
