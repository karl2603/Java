import java.util.Scanner;

class FuncParaQ1{
    void validate(int n){
        if(n>=80 && n<=100){
            System.out.println("Distinction");
        }
        else if(n>=60 && n<80){
            System.out.println("First Class");
        }
        else if(n>=40 && n<60){
            System.out.println("Second Class");
        }
        else if(n>=0 && n<40){
            System.out.println("Fail");
        }
        else{
            System.out.println("Enter a valid number");
        }

    }
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks = Input.nextInt();
        FuncParaQ1 obj = new FuncParaQ1();
        obj.validate(marks);
    }
}