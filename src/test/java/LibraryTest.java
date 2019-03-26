import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book1;
    Library library;

    @Before
    public void before(){
        book1 = new Book("Space Quest","Jim Bean","Adventure");
        library = new Library();
    }

    @Test
    public void booksInLibraryCount(){
        assertEquals(0,library.bookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book1);
        assertEquals(1,library.bookCount());
    }

    @Test
    public void lookForABook(){
        library.addBook(book1);
        assertEquals(true,library.lookForBook(book1));
    }

    @Test
    public void removeSpecificBook(){
        library.addBook(book1);
        assertEquals(book1,library.removeBook(book1));
    }


}



