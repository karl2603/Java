class functions{
    int a = 20;
    int b = 10;
    void add(){
        System.out.println("Sum : "+(a+b));
    }
    static void diff(){
        functions sub = new functions();
        System.out.println("Difference : "+(sub.a-sub.b));
    }
    static void mul(){
        functions mul = new functions();
        System.out.println("Multiplication : "+(mul.a*mul.b));
    }
    void div(){
        System.out.print("Quotient : "+(a/b)+" Remainder : "+(a%b));
    }
    public static void main(String args[]){
        functions obj = new functions();
        obj.add();
        diff();
        mul();
        obj.div();
    }
}