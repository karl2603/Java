public class functionQ1 {
    int applePrice = 25;
    int quantity = 6;
    void bill(){
        int total = applePrice * quantity;
        System.out.print("Total Amount : "+total);
    }
    public static void main(String args[]){
functionQ1 obj = new functionQ1();
obj.bill();
    }
}
