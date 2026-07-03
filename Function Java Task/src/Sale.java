import java.util.Scanner;
public class Sale {
    public  static double  calculatedTotal(int morning , int  afternoon , int evening){
        int total= morning + afternoon + evening ;
        double average= total / 3.0 ;
        return  average;
    }
    public static void  giveFeedBack(double average){
        if (average>=50){
            System.out.println("High Sale");
        } else if (average>=20 && average <=49) {
            System.out.println("Moderete Sale");

        }else {
            System.out.println("Lowe Sale");
        }
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        while (true){
            System.out.println("Enter the sale of the morning: ");
            int morning=input.nextInt();
            System.out.println("Enter the sale of the afternoon: ");
            int afternoon=input.nextInt();
            System.out.println("Enter the sale of the evening: ");
            int evening=input.nextInt();
           double average= calculatedTotal(morning , afternoon , evening);
            System.out.println("Average Sale: " + average);
            giveFeedBack(average);
            System.out.println("Don want to continues (Y/N)?: ");
            char choice=input.next().charAt(0);
            if (choice=='n' || choice=='N'){
                break;
            }
        }
        input.close();
    }
}
