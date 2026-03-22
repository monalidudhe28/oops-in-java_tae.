// 2.Design a Book class (title, author, ISBN) and a Library class that manages a
// collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
// add a new book, remove a book by ISBN, and display all available books.

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void removeBook(String isbn) {
        books.removeIf(book -> book.isbn.equals(isbn));
    }

    void displayBooks() {
        for (Book book : books) {
            book.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java Basics", "James Gosling", "101"));
        lib.addBook(new Book("OOP Concepts", "Bjarne Stroustrup", "102"));

        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("After removal:");
        lib.displayBooks();
    }
}
