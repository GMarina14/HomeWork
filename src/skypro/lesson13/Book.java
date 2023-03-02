package skypro.lesson13;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int yearOfPublishing;

    public Book(String name, Author author, int year) {
        this.bookName = name;
        this.authorName = author;
        this.yearOfPublishing = year;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        if (yearOfPublishing < 0 || yearOfPublishing > (LocalDate.now().getYear())) {
            System.out.println("Invalid year of publishing " + yearOfPublishing);
            return;
        }
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "The name of the book is " + bookName + '.'
                + authorName + ", year of publishing " + yearOfPublishing;
    }

    @Override
    public boolean equals(Object otherBook) {
        if (this == otherBook) return true;
        if (otherBook == null || getClass() != otherBook.getClass()) return false;
        Book book = (Book) otherBook;
        return bookName.equals(book.bookName) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }
}
