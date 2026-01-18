import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandlingCT1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        try {
            System.out.println("Enter Age");
            int age = Input.nextInt();
            if (age > 18) {
                System.out.println("You are eligible");
            }
            else{
                 throw new Exception();
            }
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } 
        catch (Exception e) {
            System.out.println("Age should be above 18");
        }
        finally{
            System.out.println("Program Ended");
        }


    }
}