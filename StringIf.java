import java.util.Scanner;
class StringIf{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        String Name = Input.nextLine();
        if(Name.equals("Karl")){
            System.out.print("Hi Karl");
        }
        else if(Name.equals("Hasini")){
            System.out.print("Hi Hasu");
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}