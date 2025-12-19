class forEach{
    public static void main(String args[]){
        int[] arr = {4,7,5,8,10,2,12};
        int odd = 0;
        int even = 0;
        for(int i:arr){
            if(i%2 == 0){
                even += 1;
            }
            else{
                odd += 1;
            }
        }
        System.out.println("Total Number of even numbers = "+even);
        System.out.println("Total Number of odd numbers = "+odd);
    }
}