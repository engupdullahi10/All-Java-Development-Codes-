import java.util.Scanner;
public class StudentMarksAnalyzer {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of the students: ");
        int n=input.nextInt();
        int [] mark= new int[n];
        System.out.println("Enter the marks " + n + " of the students: ");
        for (int i=0 ; i<n; i++){
            System.out.println("Students numbers" +( i + 1 )+ ":" );
            mark[i]=input.nextInt();
        }
        double sum= 0;
        for (int s:mark){
            sum+=s;
        }
        double average= sum  / n;
        int maxMarks=mark[0] , minMarks=mark[0];
        for (int i= 1 ; i<mark.length; i++){
            if (mark[i]>maxMarks){
                maxMarks=mark[i];
            }
            if (mark[i]<minMarks){
                minMarks=mark[i];
            }
        }
        int passCount= 0;
        int failCount= 0;
        for (int m : mark){
            if (m>=50){
                passCount++;
            }else {
                failCount++;
            }
        }
        System.out.println("SUMMARY STUDENTS MARKS : ");
        System.out.println("Students Numbers: " + n);
        System.out.printf("Average : %.2f%n " , average);
        System.out.println("Maximum Marks: " + maxMarks);
        System.out.println("Minimum Marks: " + minMarks);
        System.out.println("Passed Students: " + passCount);
        System.out.println("Fail Students: " + failCount);
        input.close();
    }
}
