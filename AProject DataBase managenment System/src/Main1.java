import java.util.ArrayList;

abstract class Employee {
    private String name;
    private String employeeId;

    public Employee() {
    }

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + employeeId);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public FullTimeEmployee(String name, String employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    public void displayFullTime() {
        displayDetails();
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Total Salary  : " + calculateSalary());
        System.out.println();
    }
}

class PartTimeEmployee extends Employee {
    private int hourWorks;
    private int hourlyRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int hourWorks, int hourlyRate) {
        this.hourWorks = hourWorks;
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(String name, String employeeId, int hourWorks, int hourlyRate) {
        super(name, employeeId);
        this.hourWorks = hourWorks;
        this.hourlyRate = hourlyRate;
    }

    public int getHourWorks() {
        return hourWorks;
    }

    public void setHourWorks(int hourWorks) {
        this.hourWorks = hourWorks;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourWorks * hourlyRate;
    }

    public void displayPartTime() {
        displayDetails();
        System.out.println("Hours Worked  : " + hourWorks);
        System.out.println("Hourly Rate   : " + hourlyRate);
        System.out.println("Total Salary  : " + calculateSalary());
        System.out.println();
    }
}

class Payroll {
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public double totalPayRoll() {
        double total = 0;

        for (Employee e : employees) {
            total += e.calculateSalary();
        }

        return total;
    }

    public void displayEmployees() {
        for (Employee e : employees) {

            if (e instanceof FullTimeEmployee) {
                ((FullTimeEmployee) e).displayFullTime();
            } else if (e instanceof PartTimeEmployee) {
                ((PartTimeEmployee) e).displayPartTime();
            }
        }
    }
}

public class Main1 {
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        FullTimeEmployee emp1 =
                new FullTimeEmployee("Ali", "F101", 50000);

        FullTimeEmployee emp2 =
                new FullTimeEmployee("Ahmed", "F102", 60000);

        PartTimeEmployee emp3 =
                new PartTimeEmployee("Sara", "P201", 80, 500);

        PartTimeEmployee emp4 =
                new PartTimeEmployee("Ayesha", "P202", 60, 400);

        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);
        payroll.addEmployee(emp4);

        System.out.println("===== Employee Details =====");
        payroll.displayEmployees();

        System.out.println("Total Payroll = " + payroll.totalPayRoll());
    }
}