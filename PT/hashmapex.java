import java.util.HashMap;
import java.util.Scanner;

public class hashmapex {
    public static void main(String[] args) {

        HashMap<Integer, String> stud = new HashMap<>();
        int m = 4;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            System.out.println("enter name ");
            String name = s.nextLine();
            System.out.println("enter id ");
            int id = s.nextInt();
            s.nextLine();
            stud.put(id, name);
        }
        System.out.println(stud);
        System.out.println(stud.get(2));
        
    }
}