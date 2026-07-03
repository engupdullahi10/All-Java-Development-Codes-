import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a principle amount: ");
        double principle=input.nextDouble();
        System.out.println("Enter a rate: ");
        double rate=input.nextDouble();
        System.out.println("Enter a time: ");
        double time=input.nextDouble();
        double simple_interset= (principle * rate * time) / 100;
        //output
        System.out.println("Simple Output: ");
        System.out.println("Principle: " + principle);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Simple interset: " + simple_interset);
        input.close();
    }
}
