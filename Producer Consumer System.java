class Restaurant {

    private boolean foodReady = false;

    // Chef prepares food (Producer)
    public synchronized void prepareFood() {
        try {
            while (foodReady) {
                wait(); // wait if food is already prepared
            }

            System.out.println("Chef prepared food");
            foodReady = true;

            notify(); // notify waiter

        } catch (InterruptedException e) {
            System.out.println("Chef interrupted");
        }
    }

    // Waiter serves food (Consumer)
    public synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait(); // wait if food not ready
            }

            System.out.println("Waiter served food");
            foodReady = false;

            notify(); // notify chef

        } catch (InterruptedException e) {
            System.out.println("Waiter interrupted");
        }
    }
}

// Chef Thread
class Chef extends Thread {
    Restaurant restaurant;

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        restaurant.prepareFood();
    }
}

// Waiter Thread
class Waiter extends Thread {
    Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        restaurant.serveFood();
    }
}

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Chef chef = new Chef(restaurant);
        Waiter waiter = new Waiter(restaurant);

        chef.start();
        waiter.start();
    }
}
