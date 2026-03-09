public class Compliment {
    public static void main(String[] args) {
        String[] comp = {
            "You are awesome!",
            "You code like a pro!",
            "You will top exams!",
            "Future programmer!"
        };

        int r = (int)(Math.random() * comp.length);
        System.out.println(comp[r]);
    }
}
