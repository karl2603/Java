class forEachQ1{
    public static void main(String args[]){
        int[] arr = {37,58,84,12,55,78,24,63};
        int max = arr[0];
        int min = arr[0];
        for(int i:arr){
            if(i>=max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}