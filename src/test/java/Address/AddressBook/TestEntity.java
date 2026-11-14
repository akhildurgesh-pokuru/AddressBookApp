package Address.AddressBook;

import Address.AddressBook.Model.BookStore;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestEntity {

    @Test
    public void testEntityConstructor(){
        BookStore bookStore = new BookStore("badminton", "ramu", 50);

        assertEquals(101,bookStore.getId());
        assertEquals("indiancric",bookStore.getBook_name());
        assertEquals("akhil",bookStore.getAuthor());
        assertEquals(100,bookStore.getPrice());
    }

    @Test
    public void testSetterAndGetters(){
        BookStore bookStore = new BookStore();

        bookStore.setId(122L);
        bookStore.setBook_name("cricket");
        bookStore.setAuthor("akhil");
        bookStore.setPrice(20);

        assertEquals(122,bookStore.getId());
        assertEquals("cricket",bookStore.getBook_name());
        assertEquals("akhil",bookStore.getAuthor());
        assertEquals(20,bookStore.getPrice());

    }

}
