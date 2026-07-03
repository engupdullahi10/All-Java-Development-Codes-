//Class Employee
class employee{
    private int empId;
    private  String name;
    private int salary;
    // Static
    static int totalEmployee;
    // method static
    static {
        System.out.println("Employee System Initialized");
        totalEmployee= 0;
    }
    // Default Construction
    public  employee(){
        this.empId= 0;
        this.name= "Unknown";
        this.salary= 0;
        totalEmployee++;
    }
    //Method Construction
    public employee(int empId , String name , int salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
        totalEmployee++;
    }
    //Getter & Setter

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getTotalEmployee() {
        return totalEmployee;
    }

    public static void setTotalEmployee(int totalEmployee) {
        employee.totalEmployee = totalEmployee;
    }
    //	increaseSalary(double amount)
    public void increaseSalary(int amount){
        salary+= amount;
    }
    //Show Employee Details Inform
    public  void  displayInform(){
        System.out.println("\n====Show Employee Details & Information====");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee name: " +name);
        System.out.println("Employee salary: " +salary);
    }
    // Show Total Employee
    public static  void showTotalEmployee(){
        System.out.println("Total Employee: " + totalEmployee);
    }
}
public class Task19 {
    //Task2: Employee Salary System
    public static void main(String[] args){
        // 	Create 2 employees
        employee e1=new employee(1001 , "Drs Hafsa" , 5000);
        employee e2=new employee(1004 , "Eng Abdalla" , 7500);
        //	Increase salary
        e1.increaseSalary(1500);
        e2.increaseSalary(1000);
        //	Display details
        e1.displayInform() ;
        e2.displayInform();
        //	Show total
        System.out.println("\nShow Total Employee");
        employee.showTotalEmployee();
    }
}
