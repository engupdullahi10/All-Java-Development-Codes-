import java.util.Scanner;

public class Task4 {
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a basic salary: ");
        double basic_salary=input.nextDouble();
        System.out.println("Enter bonus percentage: ");
        double bonus=input.nextDouble();
        double total_salary= basic_salary +(basic_salary * bonus) / 100;
        System.out.println("Simple Output: ");
        System.out.println("Total Salary: " + total_salary);
        input.close();
    }
}
