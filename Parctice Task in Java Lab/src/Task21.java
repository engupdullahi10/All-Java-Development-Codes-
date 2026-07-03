import java.util.Scanner;
public class Task21 {
    public  static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of the temperature: ");
        double temperature=input.nextDouble();
        if (temperature<36){
            System.out.println("Low Temperature: ");
        } else if (temperature>=36 && temperature<=37.5) {
            System.out.println("Normal Temperature: ");
        }else {
            System.out.println("Height Temperature: ");
        }
        input.close();
    }
}
