import java.io.*;
import java.util.Scanner;

public class EmployeeAttendanceSalaryStatus {
    //✅ PROJECT 2: Employee Attendance & Salary Status
    public static String CalculateAttendancePercentage(int attendance){
        if (attendance>=90){
            return "Full Salary";
        } else if (attendance>=70) {
            return "Partial Salary";
        }else {
            return  "No Salary";
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name=input.nextLine();
        System.out.print("Enter total working days: ");
        int days=input.nextInt();
        System.out.print("Enter days present: ");
        int dayPresent=input.nextInt();
        int Attendance= (int) ((dayPresent * 100.0)  / days) ;
        String SalaryStatus=CalculateAttendancePercentage(Attendance);
        saveFile(name , days , dayPresent , Attendance , SalaryStatus);
        readFile();
    }
    //Save file
    public static void saveFile(String name , int days , int dayPresent , int Attendance , String SalaryStatus){
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("employeeRecord.txt"));
            bw.write(name + " , " + days + " , " + dayPresent + " , " + Attendance + " , " + SalaryStatus);
            bw.newLine();
            bw.close();
            System.out.println("Save employee record file successfully.");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    //Reading File
    public static void readFile(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("employeeRecord.txt"));
            String line;
            System.out.println("--------Data Inform---------");
            while ((line=br.readLine())!=null){
                String[] data=line.split(",");
                if (data.length==5){
                    System.out.println("Employee Name: " +data[0].trim());
                    System.out.println("Total Days:" + data[1].trim());
                    System.out.println("Present Days: " + data[2].trim() );
                    System.out.println("Attendance: " + data[3].trim());
                    System.out.println("Salary Status: " + data[4].trim());
                }
            }
            br.close();
        }catch (IOException e){
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
