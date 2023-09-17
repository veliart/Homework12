package Homework12;

import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getAuthorFirstName(), author.getAuthorFirstName()) && Objects.equals(getAuthorLastName(), author.getAuthorLastName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}
