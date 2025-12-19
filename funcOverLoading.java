import java.util.Scanner;
class funcOverLoading{
    void sum(int n1){
        System.out.println("Sum = "+ n1);
    }
    void sum(int n1, int n2){
        System.out.println("Sum = "+(n1+n2));
    }
    void sum(int n1,int n2, int n3){
        System.out.println("Sum = "+(n1+n2+n3));
    }
    
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n1 = Input.nextInt();
        System.out.println("Enter Number : ");
        int n2 = Input.nextInt();
        System.out.println("Enter Number : ");
        int n3 = Input.nextInt();
        funcOverLoading obj = new funcOverLoading();
        obj.sum(n1);
        obj.sum(n1,n2); 
        obj.sum(n1, n2, n3);       
    }
}