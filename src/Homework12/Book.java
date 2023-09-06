package Homework12;

public class Book {
    private String bookTitle;
    private Author author;
    private int year;
    public Book(String bookTitle, Author author, int year) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
