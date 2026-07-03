import java.util.Scanner;
public class TemperatureSystem {
    public static double temperatureCalculated(int morning , int afternoon , int evening){
        int total= morning + afternoon + evening ;
        double average= total / 3.0 ;
        return  average;
    }
    public static void giveTemperatureFeedback(double average){
        if (average>35){
            System.out.println("Very Hot Day. ");
        } else if (average>25 && average<=34) {
            System.out.println("Normal Day. ");
        } else if (average>15 && average<=24) {
            System.out.println("Cool Day. ");
        }else {
            System.out.println("Cold Day. ");
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Enter the temperature of the morning: ");
            int morning=input.nextInt();
            System.out.println("Enter the temperature of the afternoon: ");
            int afternoon= input.nextInt();
            System.out.println("Enter the temperature of the evening: ");
            int evening=input.nextInt();
            double average= temperatureCalculated(morning , afternoon ,evening);
            System.out.println("Average Temperature: " + average);
            giveTemperatureFeedback(average);
            System.out.println("Don want to continues (Y/N)?: ");
            char choice=input.next().charAt(0);
            if (choice=='n'||choice=='N'){
                break;
            }
        }
        input.close();
    }
}
