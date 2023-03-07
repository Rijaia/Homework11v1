package lesson11;

import java.util.Objects;

public class Book {
    private int publicationYear;
    private final String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationYear, name, author);
    }

    private Author author;

    public Book (String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    public String getName() {
        return name;
    }
    public String toString() {
        return "Название книги "+this.name+" Год публикации "+this.publicationYear;
    }

}