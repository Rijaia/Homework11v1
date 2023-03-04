package lesson11;
public class Book {
    private int publicationYear;
    private final String name;

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

}