import java.util.Scanner;
class nestLoopsQ1{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}