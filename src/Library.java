public class Library {
    private String name;

    public Library(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void printInfo() {
        System.out.println("Library: " + name);
    }
}