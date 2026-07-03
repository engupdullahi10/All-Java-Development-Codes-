import java.io.*;
public class StudentData {
    public static void main(String[] args) throws  IOException {
        FileWriter fw=new FileWriter("data.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Abdullahi , 23 , L1S25BSSE0026 ,  2.25 \n");
        bw.close();
        fw.close();
        System.out.println("Data written successfully!");
    }
}
