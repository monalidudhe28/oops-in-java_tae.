// 22. Banking System
// Create a class BankingSystem. Multiple threads access shared
// account balance using synchronized block.
// Output: Balance deduction messages.

class BankingSystem {
    private int balance = 1000;

    void withdraw(String user, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(user + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(user + ": Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem account = new BankingSystem();

        Thread t1 = new Thread(() -> account.withdraw("User1", 700));
        Thread t2 = new Thread(() -> account.withdraw("User2", 500));

        t1.start();
        t2.start();
    }
}
