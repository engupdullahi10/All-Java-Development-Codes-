import java.io.File;
import java.io.IOException;
public class ExampleFiles {
    //Example Files
    public static void main(String[] args){
        try{
            File file=new File("data.txt");
            if (file.createNewFile()){
                System.out.println("File Create.");
            }else {
                System.out.println("File already exist.");
            }
        }catch (IOException e){
            System.out.println("Error: Create file.");
        }
    }
}