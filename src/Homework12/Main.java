package Homework12;

public class Main {
    public static void main(String[] args) {
        Author marks = new Author("Carl", "Marks");
        Author engels = new Author("Fridrich", "Engels");
        Book colobok = new Book("Colobok", marks, 1873);
        Book harryPotter = new Book("Harry Potter", engels, 2001);
        colobok.setYear(2023);
    }
}