import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        PrintedBook book1 = new PrintedBook("abai", "abay", 2025, true);
        PrintedBook book2 = new PrintedBook("rabi", "rabi", 2008, true);

        LibraryMember member1 = new LibraryMember("Amina", 1);
        Library library = new Library("My Library");

        library.addBook(book1);
        library.addBook(book2);

        library.printInfo();
        member1.printInfo();
        library.showAllBooks();

        if (book1.getYear() == book2.getYear()) {
            System.out.println("same year");
        } else {
            System.out.println("different years");
        }

        // ---- Assignment 2: Scanner ----
        Scanner sc = new Scanner(System.in);
        System.out.print("Search book by title: ");
        String key = sc.nextLine();

        library.searchByTitle(key);

        library.sortByYear();
        System.out.println("After sorting:");
        library.showAllBooks();
    }
}
