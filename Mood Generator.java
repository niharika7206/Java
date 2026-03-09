public class Mood {
    public static void main(String[] args) {
        String[] moods = {"Happy", "Sad", "Excited", "Sleepy", "Angry"};
        
        int index = (int)(Math.random() * moods.length);
        System.out.println("Your mood today: " + moods[index]);
    }
}
