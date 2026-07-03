import java.util.Scanner;
public class App {
    public  static void main(String[]args){
        //ARRAY LIST
        Scanner input=new Scanner(System.in);
        int [] marks= new  int[5];
        System.out.println("Students Marks: ");
        for (int i=0; i<5; i++){
            marks[i]=input.nextInt();
        }
    }
}
