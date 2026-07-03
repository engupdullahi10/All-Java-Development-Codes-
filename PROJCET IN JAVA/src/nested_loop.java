public class nested_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {        // Outer loop for rows
            for (int j = 1; j <= i; j++) {     // Inner loop for stars
                System.out.print("*");         // Print stars on the same line
            }
            System.out.println();              // Move to the next line
        }

    }
}
