import java.util.Scanner;
public class FrequencyTable {
    //Task 04: Character Frequency Table
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a text: ");
        String word=input.nextLine();
        char[] text=word.toCharArray();
        boolean [] counted=new boolean[text.length];
        for (int i=0; i<text.length;i++){
            if (counted[i] || text[i]==' ')
                continue;
            int count= 1;
            for (int j= i+1; j<text.length;j++){
                if (text[i]==text[j]){
                    count++;
                    counted[j]= true;
                }
            }
            System.out.println(text[i] + " : " + count);
        }
    }
}
