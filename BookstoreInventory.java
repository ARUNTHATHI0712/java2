import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int copies;

    public Book(String title, String author, double price, int copies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Copies: " + copies;
    }
}

public class BookstoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book " + (i + 1));
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Number of Copies: ");
            int copies = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            books[i] = new Book(title, author, price, copies);
        }

        System.out.println("\nBook Details:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
