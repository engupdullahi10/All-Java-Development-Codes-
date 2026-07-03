import  java.util.Arrays ;
public class Main {
    //FUNCTION
    static int MyMethods(int a , int b){
        return  a + b ;
    }
    static int doubleGame(int y){
        return  y * 2;
    }
    public static void main(String[] args){
        //STRING
        String txt= "Please build a responsive portfolio. My name is Eng Abdullahi";
        System.out.println("The length of the sting is: " + txt.length());
        String name= "Abdullahi";
        System.out.println("My name is: " + name.toLowerCase());
        System.out.println("My name is: "+name.toUpperCase() );
        String Name="Abdullahi";
        int age= 25;
        System.out.println("My name is " + Name + " and iam " + age + " years old.");
        String Txt= "Abdullahi";
        System.out.println(txt.charAt(0));
        System.out.println(txt.charAt(8));
        // ARRAY
        String[] myName={"Abdullahi " , "Hafso " , "Abdalla " , "Yasiman " , "Yasir " , "Zamzam "};
        System.out.println(myName.length);
        System.out.println(myName[2]);
        System.out.println(myName[0]);
        System.out.println(myName[5]);

        String [] [] employee={{"1" , "Abdullahi "} , {"2" , "Hafso " , } ,{"3" , "Yasir"}};
        String [] employeeId={"ID Number: " , "Name: "};
        for (int i=0; i<employee.length;i++){
            System.out.println(employeeId[0] + employee[i][0]);
            System.out.println(employeeId[1] + employee[i][1]);
        }
        System.out.println("--------------");
        System.out.println("ID Number | Name |");
        System.out.println("--------------");
        for (String[] e: employee){
            System.out.printf("| %-10s | %-10s |\n" , e[0] ,e[1]);
        }
        System.out.println("--------------");
        System.out.println("The sum of the number is: " + MyMethods(80 , 90));
        for (int i=1 ; i<=5; i++){
            System.out.println("Double Game Of " + i + " is : " + doubleGame(i));
        }
    }
}