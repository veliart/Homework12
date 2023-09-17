package Homework12;

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
    public String toString() {
        return "First name: " + authorFirstName + ", last name: " + authorLastName;
    }
    public boolean equals(Author author) {
        if (this.authorFirstName.equals(author.authorFirstName) && this.authorLastName.equals(authorLastName)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorFirstName);
    }
}
