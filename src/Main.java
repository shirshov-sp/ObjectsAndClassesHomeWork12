public class Main {

    public static void main(String[] args) {
        System.out.println("ДЗ \"Объекты и Классы\"\n");

        Author dostoevskiy = new Author("Фёдор", "Достоевский");
        Author pushkin = new Author("Александр", "Пушкин");
        Author twain = new Author("Марк", "Твен");

        System.out.println(dostoevskiy.getName() + " " + dostoevskiy.getLastName());
        System.out.println(pushkin.getName() + " " + pushkin.getLastName());
        System.out.println(twain.getName() + " " + twain.getLastName());
        System.out.println();

        Book book1 = new Book("Преступление и наказание", dostoevskiy, 1866);
        Book book2 = new Book("Сказка о рыбаке и рыбке", pushkin, 1835);
        Book book3 = new Book("Приключения Тома Сойера", twain, 1976);

        System.out.println(book1.getTitle() + ", " + book1.getAuthor() + ", " + book1.getPublicationYear());
        System.out.println(book2.getTitle() + ", " + book2.getAuthor() + ", " + book2.getPublicationYear());
        System.out.println(book3.getTitle() + ", " + book3.getAuthor() + ", " + book3.getPublicationYear());
        System.out.println();

        book3.setPublicationYear(1876);

        System.out.println(book3.getTitle() + ", " + book3.getAuthor() + ", " + book3.getPublicationYear());
    }
}