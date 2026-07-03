import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Task1 {
    //Writing Filed
    public static void main(String[] args){
        try {
            FileWriter fw=new FileWriter("data.csv");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("ID  Name  Salary");
            bw.newLine();
            bw.write("101  Abdullahi  3000$");
            bw.newLine();
            bw.write("102  Aisha  3000");
            bw.newLine();
            bw.write("103   Yasir  2500");
            System.out.println("Employee data successful. ");
            bw.close();
            fw.close();
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
