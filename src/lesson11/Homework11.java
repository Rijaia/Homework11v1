package lesson11;

public class Homework11 {
    public static void main(String[] args){
     Author maks = new Author("Макс","Фрай");
        System.out.print(maks.getFirstName()+" ");
        System.out.println(maks.getSurname());

        Book book = new Book("Чужак", 2019);
        System.out.println(book.getName()+" ");
        System.out.println(book.getPublicationYear());

      Author chuck = new Author("Chuck", "Palanick");
        System.out.print(chuck.getFirstName()+" ");
        System.out.println(chuck.getSurname());

        Book book1 = new Book("Бойцовский клуб", 1996);
        System.out.println(book1.getName());
        System.out.println(book1.getPublicationYear());
        book.setPublicationYear(1987);
        System.out.println("Измененный год "+book.getPublicationYear());
        System.out.println(book);
        System.out.println(maks);
        System.out.println(book1.equals(book));
        System.out.println(maks.equals(chuck));
    }
}
