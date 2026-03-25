// 18. A bank has a fixed interest rate that should not be changed once it is defined.
// Question:
// Create a class Bank with a final variable interestRate.
// Create a method calculateInterest(double amount) that calculates the interest using
// the fixed rate.
// Write a program to calculate interest for different customers.

class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

        double i1 = b.calculateInterest(10000);
        double i2 = b.calculateInterest(20000);
        double i3 = b.calculateInterest(30000);

        System.out.println("Interest 1: " + i1);
        System.out.println("Interest 2: " + i2);
        System.out.println("Interest 3: " + i3);
    }
}
