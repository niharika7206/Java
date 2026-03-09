import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello this is a Java file example");

            writer.close();

            System.out.println("File written successfully");

        } catch (IOException e) {

            System.out.println("Error occurred");

        }
    }
}
