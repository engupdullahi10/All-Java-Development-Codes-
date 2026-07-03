import java.util.Scanner;
public class UniversityCourseRegistrationManagementSystem {
    public static void  main(String[] args){
        //University Course Registration
        //Management System
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To University Course Registration Management System.! ");
        int totalCredit= 0;
        String  registeredCourses= "";
        int courseNumber= 0;
        System.out.println("Enter your name: ");
        String name = input.next();
        do {
            System.out.println("Menu Options: ");
            System.out.println("1.View Available Courses: ");
            System.out.println("2.Register for Courses: ");
            System.out.println("3.Exit: ");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Available Courses: ");
                    System.out.println("CS101 - Programming Fundamentals (3): ");
                    System.out.println("CS102 - Object-Oriented Programming (3): ");
                    System.out.println("CS103 - Data Structures (4): ");
                    System.out.println("CS104 - Database Systems (3): ");
                    System.out.println("CS105 - Operating Systems (3): ");
                    break;
                case 2:
                    System.out.println("Register for Courses: ");
                    System.out.println("Enter How many courses do you want to register for?: ");
                    courseNumber = input.nextInt();
                    for (int i = 1; i <= courseNumber; i++) {
                        System.out.println("Enter courses code  #" + i + ":");
                        String code = input.next().toUpperCase();
                        switch (code) {
                            case "CS101":
                                totalCredit += 3;
                                registeredCourses += "CS101 (3), ";
                                break;
                            case "CS102":
                                totalCredit += 3;
                                registeredCourses += "CS102 (3), ";
                                break;
                            case "CS103":
                                totalCredit += 4;
                                registeredCourses += "CS103 (4), ";
                                break;
                            case "CS104":
                                totalCredit += 3;
                                registeredCourses += "Cs104 (3), ";
                                break;
                            case "CS105":
                                totalCredit += 3;
                                registeredCourses += "CS105 (3), ";
                                break;
                            default:
                                System.out.println("Invalid Courses Code. Please Try Again.");
                                i--;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exit the programming. ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid menu option. ");
                    System.exit(0);
                    continue;
            }
            System.out.println("University Course Registration Management System Summary:! ");
            System.out.println("Students Name: " + name);
            System.out.println("Registered Courses: " + registeredCourses);
            System.out.println("Total Credit Hours: " + totalCredit);
            System.out.println("Thanks your for using University Course Registration Management System:! ");
        } while (true);
    }
}
