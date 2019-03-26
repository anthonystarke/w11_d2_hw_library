import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;

    public Borrower(){
        bookCollection = new ArrayList<>();

    }

    public int bookCount(){
        return bookCollection.size();
    }

    public void getNewBook(Book newBook){
        bookCollection.add(newBook);
    }
}
