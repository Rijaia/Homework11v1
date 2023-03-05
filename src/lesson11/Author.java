package lesson11;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String surname;
    public Author (String name, String surname) {
        this.firstName = name;
        this.surname = surname;
    }
   public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }
    public String toString() {
        return "Имя автора "+this.firstName+" Фамилия "+this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }
}