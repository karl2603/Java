class returnKey{
    int sum(int a, int b){
        int add = a + b;
        return add;
    }
    public static void main(String args[]){
        returnKey obj = new returnKey();
        int total = obj.sum(20,40);   
        System.out.print("Sum : "+total);     
    }
}