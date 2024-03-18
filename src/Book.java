public class Book <T> {
    protected T nameOfBook;
    protected T author;

    public Book() {

    }
    public Book(T nameOfBook, T author) {
        this.nameOfBook = nameOfBook;
        this.author = author;
    }

    public T getAuthor() {
        return author;
    }

    public T getNameOfBook() {
        return nameOfBook;
    }
}
