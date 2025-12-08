import java.util.Scanner;

class loop{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int num = Input.nextInt();
        int sum = 0;
        for(int i=0;i<=num;i++){
            sum = sum + (i*i);
        }
        System.out.print(sum);
    }
    
}