import java.util.*;

public class hashSet {
    public static void main(String args[]) {
        HashSet<String> userName = new HashSet<String>();
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter UserNames : ");
        for (int i = 1; i <= 5; i++) {
            userName.add(Input.nextLine());
        }
        System.out.println("Enter the username to search");
        String searchName = Input.nextLine();
        if(userName.contains(searchName)){
            System.out.println("Username found");
        }
        else{
            System.out.println("Username not found");
        }
        Input.close();
        System.out.println(userName);
        System.out.println("Total Number of Users : "+userName.size());
    }

}
