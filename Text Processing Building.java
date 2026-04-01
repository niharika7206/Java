public class TextProcessingBuilder {
    public static void main(String[] args) {

        // Create StringBuilder
        StringBuilder sb = new StringBuilder("Java");

        // Append additional text
        sb.append(" Programming");

        // Display modified string
        System.out.println("Modified String: " + sb);
    }
}

/*
Comparison between StringBuilder and StringBuffer:

1. StringBuilder is NOT thread-safe (faster).
2. StringBuffer is thread-safe (synchronized, slower).
3. Use StringBuilder in single-threaded programs.
4. Use StringBuffer in multi-threaded environments.
*/
