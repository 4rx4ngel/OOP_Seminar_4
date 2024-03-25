public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book<String> book_1 = new Book<>("Книга_1", "Автор_1");
        library.addBook(1,book_1);
        Book<String> book_2 = new Book<>("Книга_2", "Автор_2");
        library.addBook(2,book_2);
        Book<String> book_3 = new Book<>("Книга_3", "Автор_3");
        library.addBook(3,book_3);
        System.out.println(library.libraryCardIssuance(1));
        library.showInfo();

    }
}