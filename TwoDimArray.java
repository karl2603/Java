class TwoDimArray{
    public static void main(String args[]){
        int [][] mat = {{12,15,22},{20,0,12},{18,32,41}};
        System.out.println("Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}