package seminars.fourth.book;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    InMemoryBookRepository b = mock(InMemoryBookRepository.class);
    BookService serv = new BookService(b);

    @Test
    void findBook() {

        Book result = new Book("1", "Book1", "Author1");
        String id = "1";

        when(serv.findBookById(id)).thenReturn(result);

        assertEquals(serv.findBookById(id), result);
    }
    @Test
    void findAllBooks() {
        ArrayList<Book> result = new ArrayList<Book>();

        when(serv.findAllBooks()).thenReturn(result);

        assertEquals(serv.findAllBooks(), result);
    }
}