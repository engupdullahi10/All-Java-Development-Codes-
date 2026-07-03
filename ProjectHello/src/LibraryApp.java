import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {

    // =========================
    // BOOK MODEL (OOP)
    // =========================
    static class Book {
        private int id;
        private String title;
        private String author;
        private boolean issued;

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.issued = false;
        }

        public int getId() {
            return id;
        }

        public boolean isIssued() {
            return issued;
        }

        public void issue() {
            issued = true;
        }

        public void giveBack() {
            issued = false;
        }

        @Override
        public String toString() {
            return "ID: " + id +
                    " | Title: " + title +
                    " | Author: " + author +
                    " | Status: " + (issued ? "Issued" : "Available");
        }
    }


    // =========================
    // LIBRARY LOGIC
    // =========================
    static class Library {

        private ArrayList<Book> books = new ArrayList<>();

        public void addBook(int id, String title, String author) {
            books.add(new Book(id, title, author));
            System.out.println("Book added successfully.");
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books in library.");
                return;
            }

            for (Book b : books) {
                System.out.println(b);
            }
        }

        public Book findBook(int id) {
            for (Book b : books) {
                if (b.getId() == id)
                    return b;
            }
            return null;
        }

        public void issueBook(int id) {
            Book b = findBook(id);

            if (b == null) {
                System.out.println("Book not found.");
                return;
            }

            if (b.isIssued()) {
                System.out.println("Book already issued.");
            } else {
                b.issue();
                System.out.println("Book issued successfully.");
            }
        }

        public void returnBook(int id) {
            Book b = findBook(id);

            if (b == null) {
                System.out.println("Book not found.");
                return;
            }

            if (!b.isIssued()) {
                System.out.println("Book was not issued.");
            } else {
                b.giveBack();
                System.out.println("Book returned successfully.");
            }
        }

        public void removeBook(int id) {
            Book b = findBook(id);

            if (b == null) {
                System.out.println("Book not found.");
                return;
            }

            if (b.isIssued()) {
                System.out.println("Cannot remove issued book.");
                return;
            }

            books.remove(b);
            System.out.println("Book removed.");
        }
    }


    // =========================
    // MAIN PROGRAM (UI)
    // =========================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {
            menu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    library.addBook(id, title, author);
                }

                case 2 -> library.displayBooks();

                case 3 -> {
                    System.out.print("Enter book ID: ");
                    library.issueBook(sc.nextInt());
                }

                case 4 -> {
                    System.out.print("Enter book ID: ");
                    library.returnBook(sc.nextInt());
                }

                case 5 -> {
                    System.out.print("Enter book ID: ");
                    library.removeBook(sc.nextInt());
                }

                case 6 -> System.out.println("Goodbye.");

                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 6);
    }


    static void menu() {
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");
        System.out.println("5. Remove Book");
        System.out.println("6. Exit");
        System.out.print("Choose: ");
    }
}
