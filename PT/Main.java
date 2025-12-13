class Book {

    private String title;
    private String author;
    private boolean available;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void borrowBook() {
        if (available == true) {
            available = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("You returned: " + title);
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "Karl");

        b1.borrowBook();
        b1.borrowBook();
        b1.returnBook();
        b1.borrowBook();
    }
}
