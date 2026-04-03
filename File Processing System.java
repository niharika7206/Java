class FileProcessingSystem {

    public void readFile() {
        try {
            // Simulating file reading
            System.out.println("Reading file...");

            // You can simulate an error if needed
            // int x = 10 / 0;

        } catch (Exception e) {
            System.out.println("Error while reading file");
        } finally {
            // Cleanup block (always executes)
            System.out.println("Closing file resources");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FileProcessingSystem obj = new FileProcessingSystem();
        obj.readFile();
    }
}
