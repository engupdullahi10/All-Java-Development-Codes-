import java.util.Scanner;

public class ArrayStudent {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name= input.nextLine();
        System.out.println("Enter your number of the marks: ");
        int mark=input.nextInt();
        int [] marks=new int[mark];
        int sum= 0;
        System.out.println("Number " + mark + " of subjects is: ");
        for (int i=0 ; i<marks.length;i++){
            marks[i]=input.nextInt();
            sum+=marks[i];
        }
        int  aver=sum / marks.length;
        char garde;
        if (aver>=90){
            garde =  'A';
        } else if (aver>=80) {
            garde= 'B';

        } else if (aver>=70) {
            garde= 'C';
        } else if (aver>=60) {
            garde= 'D';
        }else {
            garde= 'F';
        }
        System.out.println("Name: " + name);
        System.out.println("The sum of the number is: " + sum);
        System.out.println("The average is: " + aver);
        System.out.println("Grade is: " + garde);
        System.out.println("Thank your for using this system " + name);
        input.close();
    }
}
