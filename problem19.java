// 19. A library wants to store details of multiple books.
// Question:
// Create a class Book with attributes:
//  title
//  author
//  price
// Create an array of Book objects and display the details of all books.

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
