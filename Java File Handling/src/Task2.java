import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Task2 {
    //Reading Filed
    public static void main(String[] args){
        try {
            FileReader fr=new FileReader("data.csv");
            BufferedReader br=new BufferedReader(fr);
            String recode;
            System.out.println("Employee Recording: ");
            while ((recode=br.readLine()) != null) {
                if (recode.trim().isEmpty() || recode.startsWith("Name")){
                    continue;
                }
                String[] data = recode.split(",");
                if (data.length>3) {
                    System.out.println("ID: " + data[0].trim());
                    System.out.println("Name: " + data[1].trim());
                    System.out.println("Salary: " + data[2].trim());
                    System.out.println(".................");
                } else {
                    System.out.println("invalid input. " + recode);
                }
            }
            fr.close();
            br.close();
            System.out.println("Reading File is successful.");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
