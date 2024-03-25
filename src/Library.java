import java.util.ArrayList;
import java.util.List;

public class Library implements InteractionWithBooks { // невозможно продемонстрировать принцип
                                                       // подстановки Барбары Лисков, т.к. нет
                                                       // наследования ни от какого класса
    private List<LibraryCard<Integer, String>> issuedBooks;


    public List<LibraryCard<Integer, String>> getIssuedBooks() {
        return issuedBooks;
    }

    public Library() {
        super();
        this.issuedBooks = new ArrayList<>();
    }
    @Override
    public <T> void addBook(int cardNumber, Book<T> book) {
        LibraryCard<Integer, String> card = new LibraryCard<>(cardNumber, book.getAuthor()
                + ", " + book.getNameOfBook());
        issuedBooks.add(card);
    }
    // Open-closed principle(выделили отдельный интерфейс для взаимодействия с книгами и переопределяем его методы)

    public LibraryCard<Integer, String> libraryCardIssuance(int cardNumber) {
        for (LibraryCard<Integer, String> card : issuedBooks) {
            if (card.getNumberOfCard().equals(cardNumber)) {
                return card;
            }
        }
        return null;
    }

    @Override
    public void showInfo() {
        System.out.println("Информация о всех выданных книгах: ");
        for (LibraryCard<Integer, String> card : issuedBooks) {
            System.out.println("Номер карточки: " + card.getNumberOfCard() + ", Информация о книге: " +
                    card.getInformationAboutBook());
        }
    }
}
