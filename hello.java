import java.util.Scanner;
class hello{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        int c = a+b;
        System.out.print(c);
    }
}