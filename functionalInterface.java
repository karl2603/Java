interface A{
    void displayInfo();
}


public class functionalInterface {
    public static void main(String[] args) {
     A Karl = new A(){
     public void displayInfo(){
        System.out.println("My name is Karl Goodman");
     }   
     };
     Karl.displayInfo();
    }
}
