import java.util.Scanner;
public class OOP {
    //OOP IN JAVA BASIC ONE
    //PRESENT CLASS OOP
    static class Employee{
        private  String name;
        private  String level;
        private String TitleJob;
        private  int salary;
        public  Employee(String name , String level , String TitleJob , int salary){
            this.name=name;
            this.level=level;
            this.TitleJob= TitleJob;
            this.salary=salary;
        }
        public Employee(){
            this.name="Unknow";
            this.level="Unknow";
            this.TitleJob="Unknow";
            this.salary= 0;
        }
        //Getter methods
        public String getName(){
            return name ;
        }
        public void setName(String name){
            if (name.isEmpty()){
                System.out.println("No name is the system. ");
                return;
            }
            this.name=name;
        }
        public String getLevel(){
            return  level;
        }
        public  void setLevel(String level){
            this.level=level;
        }
        public String getTitleJob(){
            return  TitleJob ;
        }
        public void setTitleJob(String TitleJob){
            this.TitleJob= TitleJob;
        }
        public int getSalary(){
            return salary;
        }
        public void setSalary(int salary){
            if (salary>0){
                this.salary=salary;
            }
        }
        public void ShowInfo(){
            System.out.println("EMPLOYEE MEMBERS:");
            System.out.println("Name: " + name);
            System.out.println("Leve: " + level);
            System.out.println("Title Job: " + TitleJob);
            System.out.println("Salary: $ " + salary);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //using default Constructor
        Employee employee = new Employee();
        System.out.println("Enter your name: ");
        employee.setName(input.nextLine());
        System.out.println("Enter the level of the job: ");
        employee.setLevel(input.nextLine());
        System.out.println("Enter  the title of the job: ");
        employee.setTitleJob(input.nextLine());
        System.out.println("Enter your salary: ");
        employee.setSalary(input.nextInt());
        employee.ShowInfo();

    }
}
