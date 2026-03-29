// 19. Online Shopping System
// Create a class OnlineShoppingSystem. Create threads for
// payment and order processing.
// Output: &#39;Processing payment...&#39; and &#39;Order confirmed...&#39;

class OnlineShoppingSystem {
    public static void main(String[] args) {
        Thread paymentThread = new Thread(() -> {
            System.out.println("Processing payment...");
        });

        Thread orderThread = new Thread(() -> {
            System.out.println("Order confirmed...");
        });

        paymentThread.start();
        orderThread.start();
    }
}

