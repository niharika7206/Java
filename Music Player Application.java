class MusicPlayer extends Thread {

    public void run() {
        try {
            System.out.println("Playing song...");

            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000); // pause for 1 second
                System.out.println("Progress " + i);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.start(); // start thread
    }
}
