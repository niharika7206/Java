class DownloadTask implements Runnable {

    private String fileName;

    // Constructor
    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            System.out.println("Downloading " + fileName + "...");

            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000); // simulate download progress
                System.out.println(fileName + " progress " + i);
            }

            System.out.println(fileName + " download complete");

        } catch (InterruptedException e) {
            System.out.println(fileName + " download interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating multiple download tasks
        Thread t1 = new Thread(new DownloadTask("File1"));
        Thread t2 = new Thread(new DownloadTask("File2"));
        Thread t3 = new Thread(new DownloadTask("File3"));

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
