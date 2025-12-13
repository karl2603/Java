public class functions {
    int a = 20;
    int b = 10;
    void addition(){
        System.out.println("Sum : "+(a+b));
    }
    static void subtraction(){
        functions sub = new functions();
        System.out.println("Difference : "+(sub.a-sub.b));
    }
    public static void main(String args[]){
        functions add = new functions();
        add.addition();
        subtraction();
    }
}
