class DownloadFile implements Runnable {
    public void run() {
        System.out.println("Download Started...");
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
                System.out.println(i+"%");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("File downloaded");
    }
}

public class runnable {
    public static void main(String args[]) {
        DownloadFile File = new DownloadFile();
        Thread File1 = new Thread(File);
        File1.start();
    }
}
