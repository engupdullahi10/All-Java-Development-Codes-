import java.util.Scanner;
class  SoftwareEngineer{
    String name ;
    int age;
    String level;
    int salary ;
    String jobTitle;
    public  SoftwareEngineer(String name , int age , String leve , int salary , String jobTitle){
        this.name= name;
        this.age= age;
        this.level= leve ;
        this.salary= salary ;
        this.jobTitle = jobTitle ;
    }
    public void display_info(){
        System.out.println("Software Engineer Details: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Level: " + this.level);
        System.out.println("Salary: " + this.salary);
        System.out.println("Job Title: " + this.jobTitle);
    }
}
public class classSoftware {
    public static void  main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=input.nextLine();
        System.out.println("Enter your age: ");
        int age=input.nextInt();
        input.nextLine();
        System.out.println("Enter your level : ");
        String level=input.nextLine();
        System.out.println("Enter your salary: ");
        int salary= input.nextInt();
        input.nextLine();
        System.out.println("Enter your Job Title: ");
        String jobTitle=input.nextLine();
        SoftwareEngineer se1=new SoftwareEngineer(name , age , level , salary , jobTitle );
        se1.display_info();
    }
}
