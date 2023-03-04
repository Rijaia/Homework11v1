package lesson11;
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

}