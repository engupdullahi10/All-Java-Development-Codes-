import  java.io.*;
import java.util.*;
class  Student{
    String name;
    int age ;
    String rollNum;
    double cgpa;
    Student(String name , int age , String rollNum , double cgpa){
        this.name=name.trim();
        this.age=age;
        this.rollNum= rollNum ;
        this.cgpa=cgpa;
    }
}
public class WriteCSV {
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
        students.add(new Student("Abdullahi " , 25 , "L1S25BSSE0026" , 2.33));
        students.add(new Student("Yasmina " , 20 , "L1S25BSSE002" , 2.44));
        students.add(new Student("Imran " , 19 , "L1S25BSSE002" , 2.33));
        students.add(new Student("Mua'da " , 19 , "L1S25BSSE007" , 3.22));
        students.add(new Student("Aisha" , 20 , "L1S25BSSE0021" , 3.33));
        students.add(new Student("Abdullahi " , 25 , "L1S25BSSE0026" , 2.33));
        students.add(new Student("Yasmina " , 20 , "L1S25BSSE002" , 2.44));
        students.add(new Student("Imran " , 19 , "L1S25BSSE002" , 2.33));
        students.add(new Student("Mua'da " , 19 , "L1S25BSSE007" , 3.22));
        students.add(new Student("Aisha" , 20 , "L1S25BSSE0021" , 3.33));
        students.add(new Student("Abdullahi " , 25 , "L1S25BSSE0026" , 2.33));
        students.add(new Student("Yasmina " , 20 , "L1S25BSSE002" , 2.44));
        students.add(new Student("Imran " , 19 , "L1S25BSSE002" , 2.33));
        students.add(new Student("Mua'da " , 19 , "L1S25BSSE007" , 3.22));
        students.add(new Student("Aisha" , 20 , "L1S25BSSE0021" , 3.33));
        students.add(new Student("Abdullahi " , 25 , "L1S25BSSE0026" , 2.33));
        students.add(new Student("Yasmina " , 20 , "L1S25BSSE002" , 2.44));
        students.add(new Student("Imran " , 19 , "L1S25BSSE002" , 2.33));
        students.add(new Student("Mua'da " , 19 , "L1S25BSSE007" , 3.22));
        students.add(new Student("Aisha" , 20 , "L1S25BSSE0021" , 3.33));
        students.sort(Comparator.comparing(s -> s.name.toLowerCase()));
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("student.csv"))) {
            bw.write("Name , Age , ID , CGPA");
            bw.newLine();
            for (Student s: students){
                bw.write(s.name + " , " + s.age + "  , " + s.rollNum + " , " + s.cgpa + " , ");
                bw.newLine();
            }
            System.out.println("CSV file created in A–Z sequence.");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}