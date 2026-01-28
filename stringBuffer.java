import java.util.Scanner;
public class stringBuffer {
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = Input.nextLine();
        Input.close();
        if(name.equals("Kamal")){
            System.out.println("Malak👻");
            return;
        }
        StringBuffer reverseName = new StringBuffer();
        reverseName.append(name);
        reverseName.reverse();
        System.out.println(reverseName);
    }
}
