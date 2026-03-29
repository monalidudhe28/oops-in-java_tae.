// 15. Bank Application
// Create a class BankApplication. Define method that throws
// exception using throws. Call method in main and handle
// exception.
// Output: &#39;Transaction processed&#39; or &#39;Exception handled in main&#39;

class BankApplication {
    void processTransaction() throws Exception {
        if (Math.random() > 0.5) {
            throw new Exception("Error");
        }
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {
        BankApplication app = new BankApplication();
        try {
            app.processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
