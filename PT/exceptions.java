import java.util.Scanner;
class exceptions{
    public static void main(String args[]){
        int a=10;
        int b =0;
        try{
            int c =a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("cannot divide by 0");
        }finally {
            System.out.println("Error found");
    }
    }
}