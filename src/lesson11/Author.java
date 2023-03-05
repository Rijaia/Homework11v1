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
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author maks = (Author) other;
        return firstName.equals(maks.firstName);

    }

}