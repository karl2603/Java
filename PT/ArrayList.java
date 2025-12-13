import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        List<String> l = new java.util.ArrayList<>();
        int n = 4;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("enter name");
            String name = sc.nextLine();
            l.add(name);
        }
        System.out.println(l);
        System.out.println(l.get(1));
        l.remove(1);
        System.out.println(l);
        System.out.println(l.get(1));
        sc.close();
    }
}