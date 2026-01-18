import java.util.Scanner;

class Divide {
    void divideNumber(int n1, int n2) {
        int result = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
    }
}

public class ErrorHandlingCT2 {
    public static void main(String args[]) {
        Divide obj = new Divide();
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Numerator : ");
        int num1 = Input.nextInt();
        System.out.println("Enter Denominator : ");
        int num2 = Input.nextInt();
        try {
            obj.divideNumber(num1, num2);
            if (num2 == 0) {
                throw new ArithmeticException(); 
            }
        } catch (ArithmeticException e) {
            System.out.println("Denominator can't be zero");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Program has been executed");
        }
    }
}
