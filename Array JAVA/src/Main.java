public class Main {
    public  static  void  main(String[] args){
        //ARRAY
        int [] marks=new int[5];
        marks[0]= 100;
        marks[1]= 90;
        marks[2]= 80;
        marks[3]= 75;
        marks[4]= 85;
        System.out.println("Students marks: ");
        for (int i=0; i<marks.length; i++){
            System.out.println("Marks " + (i + 1) + ":" + marks[i]);
        }

    }
}
