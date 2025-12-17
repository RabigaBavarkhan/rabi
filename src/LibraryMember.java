public class LibraryMember {
    private String name;
    private int id;

    public LibraryMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printInfo() {
        System.out.println("Member: " + name + ", ID: " + id);
    }
}
