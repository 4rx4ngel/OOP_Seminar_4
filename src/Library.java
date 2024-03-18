import java.util.ArrayList;
import java.util.List;

public class Library<T> extends Book<T> {
    private List<LibraryCard<Integer, String>> issuedBooks;


    public List<LibraryCard<Integer, String>> getIssuedBooks() {
        return issuedBooks;
    }

    public Library() {
        super();
        this.issuedBooks = new ArrayList<>();
    }

    public  void addBook(int cardNumber, Book<T> book) {
        LibraryCard<Integer, String> card = new LibraryCard<>(cardNumber, book.getAuthor()
                + ", "+ book.getNameOfBook());
        issuedBooks.add(card);
    }

    public LibraryCard<Integer, String> libraryCardIssuance(int cardNumber) {
        for (LibraryCard<Integer, String> card : issuedBooks) {
            if (card.getNumberOfCard().equals(cardNumber)) {
                return card;
            }
        }
        return null;
    }

    public void showInfo() {
        System.out.println("Информация о всех выданных книгах: ");
        for (LibraryCard<Integer, String> card : issuedBooks) {
            System.out.println("Номер карточки: " + card.getNumberOfCard() + ", Информация о книге: " +
                    card.getInformationAboutBook());
        }
    }
}
