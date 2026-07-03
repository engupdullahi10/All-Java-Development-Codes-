import java.util.ArrayList;
import java.util.Scanner;
abstract class Employee{
    private String name;
    private int id;
    public Employee(String name , int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee[Name="+name+" , ID="+id+" , Salary="+calculateSalary()+"]";
    }
}
class FullTimeEmployee extends Employee{
    private final int monthlySalary;
    public  FullTimeEmployee(String name , int id , int monthlySalary){
        super(name , id);
        this.monthlySalary=monthlySalary;
    }
    public double calculateSalary(){
        return monthlySalary;
    }
}
class PartTimeEmployee extends  Employee{
    private final int hourWork;
    private final int hourlyRate;
    public  PartTimeEmployee(String name , int id , int hourWork , int hourlyRate){
        super(name , id);
        this.hourWork=hourWork;
        this.hourlyRate=hourlyRate;
    }
    public  double calculateSalary(){
        return hourWork * hourlyRate ;
    }
}
class  PayrollSystem{
    private final ArrayList<Employee>employeesList=new ArrayList<>();
    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }

    public void displayEmployee(){
        for (Employee employee: employeesList){
            System.out.println(employee);
        }
    }
}
public class EmployeePayrollSystem {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        PayrollSystem ps=new PayrollSystem();
        System.out.println("Enter number of employee: ");
        int number=input.nextInt();
        for (int i=0 ; i<number; i++){
            System.out.println("1. Full Time Employee ");
            System.out.println("2. Parts Time Employee ");
            System.out.println("3. Exit ");
            System.out.println("Enter your choice: ");
            int choice=input.nextInt();
            input.nextLine();
            System.out.println("Enter name: ");
            String name=input.nextLine();
            System.out.println("Enter ID: ");
            int id=input.nextInt();
            if (choice==1){
                System.out.println("Enter monthly salary: ");
                int salary=input.nextInt();
                ps.addEmployee(new FullTimeEmployee(name , id , salary));
            } else if (choice==2) {
                System.out.println("Enter hours worked: ");
                int hourWork=input.nextInt();
                System.out.println("Enter hours rate: ");
                int hourRate=input.nextInt();
                ps.addEmployee(new PartTimeEmployee(name , id , hourWork , hourRate));
            }else {
                System.out.println("Invalid Choice. ");
                i--;
            }
        }
        System.out.println("======Employee Payroll System List=======");
        ps.displayEmployee();
        input.close();
    }
}