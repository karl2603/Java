import java.util.*;
public class hashSet2 {
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        HashSet<String> emails = new HashSet<String>(); 
        System.out.println("Enter email ids...");
        for(int i=0;i<3;i++){
            String email = Input.nextLine();
            emails.add(email);
        }
        for(String email : emails){
            System.out.println(email);
        }
        System.out.println("Enter email to search : ");
        String searchEmail = Input.nextLine();
        Input.close();
        if(emails.contains(searchEmail)){
            System.out.println("Email id exists!");
        }
        else{
            System.out.println("Doesn't exist");
        }
    }
}
