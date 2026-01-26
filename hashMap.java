import java.util.*;


public class hashMap{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        HashMap <String,Long> contact = new HashMap<String,Long>();
        for(int i=0;i<3;i++){
            System.out.println("Enter Name : ");
            String name = Input.nextLine();
            System.out.println("Enter Phone Number : ");
            Long phoneNo = Input.nextLong();
            Input.nextLine();
            contact.put(name,phoneNo);
        }
        System.out.println("--Phone Book Records--");
        for(HashMap.Entry<String,Long> entry : contact.entrySet()){
            System.out.println("Name : "+entry.getKey()+" Phone Number : "+entry.getValue());
        }
        System.out.println("Search name : ");
        String searchName = Input.nextLine();
        Input.close();
        if(contact.containsKey(searchName)){
            System.out.println("Phone Number"+contact.get(searchName));
        }
        else{
            System.out.println("Contact Not Found!");
        }

    }
}