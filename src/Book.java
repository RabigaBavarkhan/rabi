public class Book { // класс кытып жайлы инфо сактайды
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) { //аты автор и жыл
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() { return title; } // гетер и сеттер данный озгертеды
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public void printInfo() {// инфо в консоль
        System.out.println("Book: " + title + ", Author: " + author + ", Year: " + year);
    }
}