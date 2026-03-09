public class PasswordGenerator {
    public static void main(String[] args) {
        String chars = "ABC123xyz";
        String pass = "";

        for (int i = 0; i < 6; i++) {
            pass += chars.charAt((int)(Math.random() * chars.length()));
        }

        System.out.println("Generated Password: " + pass);
    }
}
