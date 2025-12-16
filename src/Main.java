class Main {
    static void main(String[] args) {

        Book book1 = new Book("Java Basics", "Me", 2025);
        Book book2 = new Book("Learning Java", "Me", 2025);

        LibraryMember member1 = new LibraryMember("Amina", 1);

        Library library = new Library("My Library");

        library.printInfo();
        member1.printInfo();
        book1.printInfo();
        book2.printInfo();

        System.out.println("Are books published in the same year?");
        System.out.println(book1.getYear() == book2.getYear());
    }
}