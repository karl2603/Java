class Jawa extends Thread{
    public void run() {
        for (int i = 0; i <= 30; i++) {
            System.out.println("Jawa");
        }
    }
}

class Yezdi extends Thread{
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Yezdi");
        }
    }
}

class BSA extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("BSA");
        }
    }
}

public class threads {
    public static void main(String args[]) {
        Jawa jawa = new Jawa();
        Yezdi yezdi = new Yezdi();
        BSA bsa = new BSA();
        jawa.setPriority(6);
        yezdi.setPriority(3);
        bsa.setPriority(1);
        jawa.start();
        yezdi.start();
        bsa.start();

    }
}
