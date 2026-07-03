import java.io.*;
public class ReadScv {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("data.txt");
        BufferedReader br=new BufferedReader(fr);
        String Recode;
        while ((Recode=br.readLine())!=null){
            String[] data=Recode.split(" , ");
            System.out.println("Name: " +data[0]);
            System.out.println("Age: " +data[1]);
            System.out.println("ID: " +data[2]);
            System.out.println("CGPA: " +data[3]);
            System.out.println("..........................");
        }
        br.close();
        fr.close();
    }
}
