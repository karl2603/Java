import java.util.*;
public class hashMap2 {
    public static void main(String args[]){
        HashMap<String,Integer> CSE = new HashMap<String,Integer>();
        Scanner Input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter student name: ");
            String name = Input.nextLine();
            System.out.print("Enter marks: ");
            int mark = Input.nextInt();
            Input.nextLine();
            CSE.put(name,mark);
        }
        int maxMark = 0;
        String maxStudent = "";
        int minMark = 100;
        String minStudent = "";
        int total = 0;
        System.out.println("--Student Records--");
        for(HashMap.Entry<String,Integer> entry : CSE.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
            total += entry.getValue();
            if(entry.getValue()>maxMark){
                maxMark = entry.getValue();
                maxStudent = entry.getKey();
            }
            if(entry.getValue()<minMark){
                minMark = entry.getValue();
                minStudent = entry.getKey();
            }   
        }
        double avg = total/5;
        System.out.println("Topper: "+maxStudent+ " ("+maxMark+")");
        System.out.println("Lowest: "+minStudent+ " ("+minMark+")");
        System.out.println("Average marks: "+avg);
        System.out.print("Enter name to search: ");
        String searchStudent = Input.nextLine();
        Input.close();
        if(CSE.containsKey(searchStudent)){
            System.out.println("Marks: "+CSE.get(searchStudent));
        }
        else{
            System.out.println("Student Not Found");
        }
    }
}
