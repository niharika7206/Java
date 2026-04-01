public class TextEditorBuffer {
    public static void main(String[] args) {

        // Create StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");

        // Insert text at specific position
        sb.insert(5, " Java");

        // Reverse the final string
        sb.reverse();

        // Display result
        System.out.println("Final String: " + sb);
    }
}
