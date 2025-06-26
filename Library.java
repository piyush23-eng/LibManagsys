import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.getTitle());
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.issue();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}
