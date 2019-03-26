import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("Space Quest","Jim Bean","Adventure");
        library = new Library();
    }

    @Test
    public void booksInLibraryCount(){
        assertEquals(0,library.bookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1,library.bookCount());
    }


}



