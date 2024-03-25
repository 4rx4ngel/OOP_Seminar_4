public class LibraryCard<K, V>{
    protected K numberOfCard; // принцип единственной ответственности,
                              // каждый класс содержит только свою зону отвественности
    protected V informationAboutBook;

    public LibraryCard() {
    }
    public LibraryCard(K numberOfCard, V informationAboutBook) {
        this.numberOfCard = numberOfCard;
        this.informationAboutBook = informationAboutBook;
    }

    public K getNumberOfCard() {
        return numberOfCard;
    }

    public V getInformationAboutBook() {
        return informationAboutBook;
    }

    @Override
    public String toString() {
        return "Выдана карточка: " + numberOfCard +
                " и книга: " + informationAboutBook;
    }
}

