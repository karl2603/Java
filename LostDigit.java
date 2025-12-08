class LostDigit{
    public static void main(String args[]){
        int[] arr = {3,5,2,1};
        int n = arr.length+1;
        int sum = 0;
        int arrTotal = 0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        for(int i=0;i<=arr.length-1;i++){
            arrTotal = arrTotal + arr[i];
        }
        int Lost = sum-arrTotal;
        System.out.print(Lost);
    }
}