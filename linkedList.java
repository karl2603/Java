import java.util.*;
public class linkedList {
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        LinkedList<String> Apps = new LinkedList<String>(); 
        System.out.println("Enter 5 apps: ");
        for(int i=0;i<5;i++){
            Apps.add(Input.nextLine());
        }
        System.out.println("Recent Apps : "+Apps);
        System.out.print("Select App : ");
        String openApp = Input.nextLine();
        Input.close();
        if(Apps.contains(openApp)){
            Apps.remove(openApp);
            Apps.addFirst(openApp);
        }
        System.out.println("Updated Recent App : "+Apps);
        Apps.removeLast();
        System.out.println("After removing least used app: "+Apps);
    }
}
