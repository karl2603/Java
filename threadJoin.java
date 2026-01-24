class Join extends Thread {
    String name = "Karl";

    public void run() {
        this.name = "Loki";
    }
}

public class threadJoin {
    public static void main(String args[]) {
        Join loki = new Join();
        loki.start();
        try {
            loki.join();
        } catch (Exception e) {

        }
        System.out.println(loki.name);

    }
}
