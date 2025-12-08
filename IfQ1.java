import java.util.Scanner;

class IfQ1 {
    public static void main(String Args[]) {
        Scanner Input = new Scanner(System.in);
        int num = Input.nextInt();
        if(num%3==0 && num%5==0){
            System.out.print("The number is divisible by 3 and 5");
        }
        else{
            System.out.print("The number isn't divisible by 3 and 5");
        }
    }
}