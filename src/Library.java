import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printInfo() {
        System.out.println("Library: " + name);
    }

    public void showAllBooks() {
        for (Book b : books) {
            b.printInfo();
        }
    }

    public void searchByTitle(String keyword) {
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                b.printInfo();
            }
        }
    }

    public void sortByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }
}
