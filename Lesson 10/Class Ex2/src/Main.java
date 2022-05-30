public class Main {

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", 2002, new String[]{"Ion Creanga", "Mihai Eminescu"});

        book.showTitleAndYear();

        book.setTitle("Amintiri din copilarie");

        book.showTitleAndYear();
    }
}
