import java.util.Scanner;
public class EmployeeSalaryCalculator {
    public  static  void main(String[] args){
        //Employee Salary Calculator
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome To Employee Salary Calculator: ");
        System.out.println("Enter how many employees are there?: ");
        int employees=input.nextInt();
        int [] salary=new int[employees];
        for (int i = 0 ; i<employees; i++){
            System.out.println("Enter the salary of the employees " + (i + 1) + " : ");
            salary[i]=input.nextInt();
        }
        int total= 0;
        int heightSalary= salary[0];
        int lowSalary= salary[0];
        for (int s: salary){
            total+=s;
            if (s>heightSalary){
                heightSalary= s;

            }if (s<lowSalary){
                lowSalary= s;
            }
        }
        double average= (double) total / salary.length;
        System.out.println("Employee Salary Calculator Summary: ");
        System.out.println("Employees Numbers: " + employees);
        System.out.println("Total Salary: " + total);
        System.out.println("Average Of The Salary: " + average);
        System.out.println("Height Salary: " + heightSalary);
        System.out.println("Lowest Salary: " + lowSalary);
        System.out.println("Thanks your for using Employee Salary Calculator:! ");
        input.close();
    }
}
