import java.util.Scanner;
class nestLoops{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int r = Input.nextInt();
        System.out.println("Enter Columns : ");
        int c = Input.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}