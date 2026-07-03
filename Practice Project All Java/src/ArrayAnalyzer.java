import java.util.Scanner;
public class ArrayAnalyzer {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        int [] analyze=new int[number];
        for (int i = 0 ; i<number ; i++){
            System.out.println("Number " + ( i + 1) + " : ");
            analyze[i]=input.nextInt();
        }
        double sum= 0;
        for (int s: analyze){
            sum+=s;
        }
        int maxNumber=analyze[0];
        int minNumber= analyze[0];
        for (int i =1; i<number; i++){
            if (analyze[i]>maxNumber){
                maxNumber=analyze[i];
            }
            if (analyze[i]<minNumber){
                minNumber= analyze[i];
            }
        }
        double average= sum / analyze.length ;
        System.out.println("Number: " + number);
        System.out.println("Total Number: " + sum);
        System.out.println("Average Number: " + average);
        System.out.println("Maximum Number: " + maxNumber);
        System.out.println("Minimum Number: " + minNumber);
    }
}
