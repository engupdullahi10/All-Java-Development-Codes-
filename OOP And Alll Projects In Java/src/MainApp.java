import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
// Class Employee
abstract class Employee {
    private String name;
    private int id;

    // Default Construction
    public Employee() {
        name = "Unknown";
        id = 0;
    }

    // Construction method
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Method Abstract
    public abstract int calculateSalary();
}

// Class Full Time Employee
class fullTimeEmployee extends Employee {
    private int monthlySalary;

    public fullTimeEmployee(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculateSalary() {
        return monthlySalary;
    }
}

// Class Part Time Employee
class partTimeEmployee extends Employee {
    private int hourWork;
    private int hourRate;

    public partTimeEmployee(String name, int id, int hourWork, int hourRate) {
        super(name, id);
        this.hourWork = hourWork;
        this.hourRate = hourRate;
    }

    public int getHourWork() {
        return hourWork;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    public int getHourRate() {
        return hourRate;
    }

    public void setHourRate(int hourRate) {
        this.hourRate = hourRate;
    }

    @Override
    public int calculateSalary() {
        return hourWork * hourRate;
    }
}

// Class Pay Roll Employee
class payRollEmployee {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void ShowEmployeeDetail() {
        for (Employee emp : employees) {
            System.out.println("Employee name: " + emp.getName());
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Salary: " + emp.calculateSalary());
        }
    }
}

public class MainApp {
    static ArrayList<Employee> employee = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Employee System");
        payRollEmployee payRollEmployee = new payRollEmployee();

        System.out.print("Enter the number of the employee: ");
        int num = input.nextInt();
        input.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("\nEmployee " + (i + 1) + " : ");
            System.out.print("Enter the types of employee (Full & Part): ");
            String types = input.nextLine().toLowerCase();

            System.out.print("Enter the employee name: ");
            String name = input.nextLine();

            System.out.print("Enter the employee ID: ");
            int id = input.nextInt();
            input.nextLine();

            if (types.equals("full")) {
                System.out.print("Enter the employee monthly salary: ");
                int salary = input.nextInt();
                input.nextLine();
                payRollEmployee.addEmployee(new fullTimeEmployee(name, id, salary));
            } else if (types.equals("part")) {
                System.out.print("Enter hours worked: ");
                int hourWork = input.nextInt();
                System.out.print("Enter hours Rate: ");
                int rate = input.nextInt();
                input.nextLine();
                payRollEmployee.addEmployee(new partTimeEmployee(name, id, hourWork, rate));
            } else {
                System.out.println("Invalid type, skipping employee.");
            }
        }

        // Save Data for Employee
        saveDataEmployee(payRollEmployee);

        // Read File Data For Employee
        ReadFileEmployee();

        // Show Details Employee
        payRollEmployee.ShowEmployeeDetail();

        input.close();
    }

    // Save Data for Employee
    public static void saveDataEmployee(payRollEmployee payRollEmployee) {
        try {
            FileWriter fw = new FileWriter("employee.txt");
            for (Employee emp : payRollEmployee.getEmployees()) {
                fw.write("Employee name: " + emp.getName() + "\n");
                fw.write("Employee ID: " + emp.getId() + "\n");
                fw.write("Employee Salary: " + emp.calculateSalary() + "\n");
            }
            fw.close();
            System.out.println("Employee Data save Successfully");
        } catch (IOException e) {
            System.out.println("Error Data Employee");
        }
    }

    // Read File Data For Employee
    public static void ReadFileEmployee() {
        try {
            FileReader fr = new FileReader("employee.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("\n===== Employee File Data =====");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error read file");
        }
    }
}