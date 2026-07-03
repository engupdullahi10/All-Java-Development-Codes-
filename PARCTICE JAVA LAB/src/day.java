import java.util.Scanner;
public class day {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [] steps=new int[20];
        for (int i=0; i<20; i++){
            System.out.println("Day" + (i + 1) + " : ");
            steps[i]=input.nextInt();
        }
        double sum= 0;
        for (int s: steps){
            sum+= s;
        }
        double average= sum / steps.length;
        int maxSteps= steps[0] , minSteps= steps[0];
        int maxDays=1 , minDays= 1;
        for (int i = 1 ; i<steps.length; i++){
            if (steps[i]>maxSteps){
                maxSteps=steps[i];
                maxDays= i + 1;
            }
            if (steps[i]<maxDays){
                maxDays=steps[i];
                minDays= i + 1;
            }
        }
        System.out.println("SUMMARY DAYS: ");
        System.out.printf("Average Steps: %.2f%n" , average);
        System.out.printf("Maximum Day: %d(Day %d)%n" ,maxSteps , maxDays);
        System.out.printf("Minimum Days: %d(Day %d)%n" , minSteps , minDays);
        input.close();
    }
}
