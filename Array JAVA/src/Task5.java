public class Task5 {
    //Task 05: Course Enrollment List
    //array-based list
    public static void main(String[]args){
        String [] student={
                "Abdullahi " ,
                "Abdalla " ,
                "Yasir " ,
                "Mohamed " ,
                "Aisha",
        };
        int size= student.length;
        System.out.println("Enrolled Students: ");
        for (int i=0; i<size; i++){
            System.out.println("Students name " + ( i + 1) + ": " + student[i]);
        }
        System.out.println("Total Students Enrolled: " + size);
    }
}
