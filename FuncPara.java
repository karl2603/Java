class FuncPara{
    void add(int a, int b){
        System.out.println("Sum : "+(a+b));
    }
    void sub(int a, int b){
        System.out.println("Difference : "+(a-b));
    }
    void mul(int a, int b){
        System.out.println("Multiplication : "+(a*b));
    }
    void div(int a, int b){
        System.out.println("Quotient : "+(a/b)+" Remainder : "+(a%b));
    }
    public static void main(String args[]){
        FuncPara obj = new FuncPara();
        obj.add(20,10);
        obj.sub(20, 10);
        obj.mul(20,10);
        obj.div(20,6);
    }
}