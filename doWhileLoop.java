import java.util.Scanner;
class doWhileLoop{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int count=0;
        do{
            System.out.println("Enter a number which is greater than 10");
            count = Input.nextInt();
        
    }
    while(count<10);
}
}