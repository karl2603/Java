import java.util.Scanner;

public class multiDimArray{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int matA[][] = new int[3][3];
        int matB[][] = new int[3][3];
        int res[][] = new int[3][3];
        System.out.println("Enter Values for Matrix A : ");
        for(int i=0;i<matA.length;i++){
            for(int j=0;j<matA.length;j++){
                matA[i][j]= Input.nextInt();
            }
        }    
        System.out.println("Enter Values for Matrix B : ");
        for(int i=0;i<matB.length;i++){
            for(int j=0;j<matB.length;j++){
                matB[i][j]= Input.nextInt();
            }
        }
        Input.close();
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res.length; j++){
                res[i][j] = matA[i][j] + matB[i][j];
            }
        }
        System.out.println("Sum of Matrix A & Matrix B");
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res.length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        

                 
    }
}