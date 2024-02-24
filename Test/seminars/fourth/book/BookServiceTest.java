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
        String id = "1";
        Book result = b.findById(id);

        when(serv.findBookById(id)).thenReturn(result);

        assertEquals(serv.findBookById(id), result);
    }
    @Test
    void findAllBooks() {
        ArrayList<Book> result = new ArrayList<Book>();

        result.addAll(b.findAll());
        when(serv.findAllBooks()).thenReturn(result);

        assertEquals(serv.findAllBooks(), result);
    }
}