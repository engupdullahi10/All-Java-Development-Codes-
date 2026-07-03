public class Task3 {
    //Task 03: Course Marks Storage
    public static void main(String[] args){
        String[] student={
                "Abdullahi",
                "Yasir",
                "Abdalla",
                "Yasmina ",
        };
        int[][] marks=new int[4][];
        marks[0]=new int[]{80 , 90 , 85};
        marks[1]=new int[]{90 , 80 , 95 , 75};
        marks[2]=new int[]{90 , 95 };
        marks[3]=new int[]{90 , 80 , 55, 60};
        for (int i=0 ; i<marks.length; i++){
            System.out.println("Student name " + ( i + 1) + ": " + student[i]);
            for (int j=0 ; j<marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
