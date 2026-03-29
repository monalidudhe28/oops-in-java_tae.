// 21. Producer Consumer System
// Create a class Restaurant. Chef prepares food and waiter serves
// it using wait() and notify().
// Output: &#39;Chef prepared food&#39; and &#39;Waiter served food&#39;

class Restaurant {
    private boolean foodReady = false;

    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() {
        while (!foodReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Thread chef = new Thread(() -> restaurant.prepareFood());
        Thread waiter = new Thread(() -> restaurant.serveFood());

        waiter.start();
        chef.start();
    }
}
