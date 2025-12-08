import java.util.Scanner;

class OddEven{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int num = Input.nextInt();
        if(num%2 == 0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}