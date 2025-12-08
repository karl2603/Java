import java.util.Scanner;

class IfElse{
    public static void main(String args[]){
        Scanner Input = new Scanner (System.in);
        int marks = Input.nextInt();
        if(marks>=60){
            System.out.print("First Class");
        }
        else if(marks>=40 && marks<60){
            System.out.print("Second Class");
        }
        else if(marks<40){
            System.out.print("Fail");
        }
    }
}