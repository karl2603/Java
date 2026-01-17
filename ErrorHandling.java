import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        try {
            System.out.println("Enter Num1 : ");
            int num1 = Input.nextInt();
            System.out.println("Enter Num2 : ");
            int num2 = Input.nextInt();
            int result = num1/num2;
            System.out.println("Result : "+result);
        } 
        catch (InputMismatchException e) {
            System.out.println("Input Mismatch");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Program Ended");
    }
}
