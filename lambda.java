interface A{
    void displayInfo();
}

public class lambda {

    public static void main(String[] args) {
        A Karl = ()->{
            System.out.println("My name is Karl Goodman");
        };
        Karl.displayInfo();
    }
}