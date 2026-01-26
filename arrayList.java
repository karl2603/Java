import java.util.*;
public class arrayList {
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        ArrayList<String> Students = new ArrayList<String>();
        for(int i=0;i<5;i++){
            Students.add(Input.nextLine());
        }
        System.out.println(Students);
    }
}
