import java.io.*;
import java.util.Scanner;
import java.time.LocalDate;

public class ResultManager {

    public static void saveResult(String name, int score, int total, String grade) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("results.txt", true));
            bw.write(name + "," + score + "/" + total + "," + grade + "," + LocalDate.now());
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("File error");
        }
    }

    public static void showPreviousResults() {
        try {
            File file = new File("results.txt");
            if (!file.exists()) {
                System.out.println("No previous results found.");
                return;
            }

            Scanner fileReader = new Scanner(file);
            System.out.println("\n======= Previous Results =======");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            System.out.println("================================");
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
        }
    }

    public static void resetResults() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("results.txt"));
            bw.write("");
            bw.flush();
            bw.close();
            System.out.println("All previous results cleared successfully!");
        } catch (IOException e) {
            System.out.println("Error clearing results file.");
        }
    }
}
