import java.util.*;
public class arrayListQ1 {
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> Marks = new ArrayList<Integer>();
        ArrayList<Integer> passedMarks = new ArrayList<Integer>();
        System.out.println("Enter Marks : ");
        for(int i=0;i<5;i++){
            Marks.add(Input.nextInt());
        }
        Input.close();
        int max = Marks.get(0);
        int min = Marks.get(0);
        double total = 0;
        System.out.print("Marks = "+Marks);
        for(int i=0;i<Marks.size();i++){
            if(Marks.get(i)>max){
                max = Marks.get(i);
            }
            if(Marks.get(i)<min){
                min = Marks.get(i);
            }
            if(Marks.get(i)>=40){
                passedMarks.add(Marks.get(i));
            }
            total = total + Marks.get(i);
        }
        double avg = total / Marks.size();
        System.out.println();
        System.out.println("Highest mark : "+max);
        System.out.println("Lowest mark : "+min);
        System.out.println("Average mark : "+avg);
        System.out.println("Passed Marks = "+passedMarks);
    }
}
