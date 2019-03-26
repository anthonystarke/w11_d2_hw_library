import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    int capacity = 50;

    public Library(){
        bookCollection = new ArrayList<>();
    }

    public int bookCount(){
        return bookCollection.size();
    }

    public void addBook(Book newBook){
        if (capacity > bookCount()) {
            bookCollection.add(newBook);
        }
    }

    public Book removeBook(){
        return bookCollection.remove(0);
    }
}
