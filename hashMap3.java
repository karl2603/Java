import java.util.*;
public class hashMap3 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        HashMap<Integer,String> students = new HashMap<Integer,String>();
        int Agrade = 0;
        int Fgrade = 0;
        for(int i=0;i<6;i++){
            System.out.println("Enter Student Roll Number : ");
            int rollNo = Input.nextInt();
            Input.nextLine();
            System.out.println("Enter Student Grade : ");
            String grade = Input.nextLine();
            students.put(rollNo, grade);
        }
        Input.close();
        System.out.println("--Student Grade Details--");
        for(HashMap.Entry<Integer,String> entry : students.entrySet()){
            System.out.println("Roll Number : "+entry.getKey()+" Grade : "+entry.getValue());
            if(entry.getValue().equals("A")){
                Agrade += 1;
            }
            if(entry.getValue().equals("F")){
                Fgrade += 1;
            }
        }
        System.out.println("Total Number of students who got distinction : "+Agrade);
        System.out.println("Total Number of students who failed : "+Fgrade);
    }
}