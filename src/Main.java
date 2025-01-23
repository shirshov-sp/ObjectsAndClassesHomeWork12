public class Main {

    public static void main(String[] args) {
        System.out.println("ДЗ \"Объекты и Классы\"\n");

        Author dostoevskiy = new Author("Фёдор", "Достоевский");
        Author pushkin = new Author("Александр", "Пушкин");
        Author twain = new Author("Марк", "Твен");

        System.out.println("Все авторы:");
        System.out.println(dostoevskiy);
        System.out.println(pushkin);
        System.out.println(twain);
        System.out.println();

        Book book1 = new Book("Преступление и наказание", dostoevskiy, 1866);
        Book book2 = new Book("Сказка о рыбаке и рыбке", pushkin, 1835);
        Book book3 = new Book("Приключения Тома Сойера", twain, 1976);

        System.out.println("Все книги:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println();

        book3.setPublicationYear(1876);
        System.out.println(book3);
        System.out.println();

        Author twainCaps = new Author("МАРК", "ТВЕН");
        if (twain.equals(twainCaps)) {
            System.out.println(twain + " и " + twainCaps + " это один и тот же человек");
        } else {
            System.out.println(twain + " и " + twainCaps + " это разные люди");
        }
        System.out.println();

        Book book4 = new Book("Принц и нищий", twainCaps, 1881);
        if (book3.equals(book4)) {
            System.out.println(book3 + " и " + book4 + " это одна и та же книга");
        } else {
            System.out.println(book3 + " и " + book4 + " это разные книги");
        }
        System.out.println();

        System.out.println("hashCode автора " + dostoevskiy + " равен " + dostoevskiy.hashCode());

    }
}