import java.util.Scanner;
class Array{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int[] Marks = new int[5];
        int total = 0;
        int largest = 0;
        for(int i=0;i<=Marks.length-1;i++){
            Marks[i]=Input.nextInt();
        }
        for(int i=0;i<=Marks.length-1;i++){
            total = total + Marks[i];
            if(Marks[i]>=largest){
            largest = Marks[i];
           }
        }
        
        System.out.println("Total Marks : "+total);
        System.out.println("Highest Mark : "+largest);
    }
}