import java.util.Scanner;

class Task1{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = Input.nextInt();
        int c = Input.nextInt();
        if(a>b&&a<c || a>c&&a<b){
            System.out.print("A is the second greatest value");
        }
        else if(b>a&&b<c || b>c&&b<a ){
            System.out.print("B is second greatest value");
        }
        else if(c>a&&c<b || c>b&&c<a){
            System.out.print("C is the greatest value");
        }
    }
}
