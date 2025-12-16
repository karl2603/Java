import java.util.Scanner;

class FuncOddEven {
    void oddEven(int n){
        if(n==0){
            System.out.println("Neither Even or Odd");
        }
        else if(n%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = Input.nextInt();
        FuncOddEven obj = new FuncOddEven();
        obj.oddEven(num);
    }
}