package skypro.lesson13;

import java.util.Objects;

public class Author {
    private String NameOfAuthor;
    private String SurnameOfAuthor;

    public Author(String name, String surname) {
        this.NameOfAuthor = name;
        this.SurnameOfAuthor = surname;
    }

    public String getNameOfAuthor() {
        return this.NameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return this.SurnameOfAuthor;
    }

    public String getFullName() {
        return this.NameOfAuthor + " " + this.SurnameOfAuthor;
    }

    @Override
    public String toString() {
        return "The author of the book is " + NameOfAuthor + " " + SurnameOfAuthor;
    }

    @Override
    public boolean equals(Object otherAuthor) {
        if (this == otherAuthor) return true;
        if (otherAuthor == null || getClass() != otherAuthor.getClass()) return false;
        Author author = (Author) otherAuthor;
        return NameOfAuthor.equals(author.NameOfAuthor) && SurnameOfAuthor.equals(author.SurnameOfAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(NameOfAuthor, SurnameOfAuthor);
    }
}
