import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        book = new Book("Space Quest","Jim Bean","Adventure");
        library = new Library();
        library.addBook(book);
        borrower = new Borrower();
    }

    @Test
    public void getBookCount(){
        assertEquals(0,borrower.bookCount());
    }

    @Test
    public void getBookFromLibrary(){
        if (library.lookForBook(book)){
            borrower.getNewBook(library.removeBook(book));
            assertEquals(1,borrower.bookCount());
            assertEquals(0,library.bookCount());
        }

    }

}
