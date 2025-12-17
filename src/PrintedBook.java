public class PrintedBook extends Book {
    private boolean available;

    public PrintedBook(String title, String author, int year, boolean available) {
        super(title, author, year);
        this.available = available;
    }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String getType() {
        return "PrintedBook";
    }
}
