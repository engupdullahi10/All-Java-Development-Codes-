// 9. File Handling Class

import java.io.*;

class FileManager {

    private String fileName;

    public FileManager() {

    }

    public FileManager(String fileName) {

        this.fileName = fileName;

    }

    public void saveData(String data) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

            bw.write(data);

            bw.newLine();

            System.out.println("Data saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving data: " + e.getMessage());

        }

    }

    public void readData() {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            System.out.println("\n======== Saved Hospital Records ========");



            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }



        } catch (FileNotFoundException e) {

            System.out.println("File not found. Please save data first.");

        } catch (IOException e) {

            System.out.println("Error reading data: " + e.getMessage());

        }

    }

}
