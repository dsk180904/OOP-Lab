import java.util.Scanner;

class Book {
    String title;
    String author;
    int edition;

    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Edition: " + edition);
    }
}

public class Exercise6 {
    public static void main(String[] args) {
  
        Book[] books = new Book[6];
        books[0] = new Book("Meow I", "Meowsii", 1);
        books[1] = new Book("Meow II", "Meowsii", 2);
        books[2] = new Book("Return of the Meow", "Meowsii", 3);
        books[3] = new Book("Meow: Revengers", "Meowsii", 1);
        books[4] = new Book("Meowsii's Autobiography", "Meowsii", 2);
        books[5] = new Book("Meow: The Final Solution", "Meowsii", 1);

        for (int i = 0; i < books.length - 1; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].title.compareTo(books[j].title) > 0) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the author's name: ");
        String authorName = scan.nextLine();
        scan.close();
        System.out.println("Books by " + authorName + ":");
        boolean found = false;
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(authorName)) { // Ignores Case differences
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by " + authorName);
        }
    }
}
