interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    String title;
    String author;
    int year;
    boolean available;

    Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true);
        LibraryItem book2 = new Book("1984", "George Orwell", 1949, false);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());
        System.out.println("Available: " + book1.isAvailable());

        System.out.println();

        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year: " + book2.getYear());
        System.out.println("Available: " + book2.isAvailable());
    }
}
