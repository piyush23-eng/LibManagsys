import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        User user = new User("Piyush", 101);

        System.out.println(user);
        boolean running = true;

        while (running) {
            System.out.println("\n1. View Books\n2. Issue Book\n3. Return Book\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    library.issueBook(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    library.returnBook(sc.nextLine());
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }

        sc.close();
    }
}
