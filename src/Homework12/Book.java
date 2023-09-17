package Homework12;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, year);
    }
}
