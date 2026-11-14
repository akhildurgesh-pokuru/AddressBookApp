package Address.AddressBook;

import Address.AddressBook.Controller.AddressController;
import Address.AddressBook.Model.BookStore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestHomeController {

    @Autowired
    AddressController addressController;

    @Test
    public void testHome() {

        String data = addressController.home();

        assertEquals("This is Address Book App", data);
    }

    @Test
    public void testAdding() {

        BookStore bookStore =
                new BookStore("badminton", "ramu", 50);

        BookStore bookStore1 =
                addressController.addBook(bookStore);

        assertNotNull(bookStore1.getId());

        assertEquals("badminton", bookStore1.getBook_name());
        assertEquals("ramu", bookStore1.getAuthor());
        assertEquals(50.0, bookStore1.getPrice());
    }

    // GET ALL BOOKS
    @Test
    public void testGetBooks() {

        List<BookStore> books = addressController.getBooks();

        assertNotNull(books);
    }

    // GET BOOK BY ID
    @Test
    public void testGetByID() {

        BookStore book = new BookStore("Java", "James", 500);

        BookStore savedBook = addressController.addBook(book);

        Optional<BookStore> result =
                addressController.getByid(savedBook.getId());

        assertTrue(result.isPresent());
        assertEquals(savedBook.getId(), result.get().getId());
        assertEquals("Java", result.get().getBook_name());
    }

    // UPDATE BOOK
    @Test
    public void testPutBook() {

        BookStore book = new BookStore("Python", "Guido", 400);

        BookStore savedBook = addressController.addBook(book);

        savedBook.setBook_name("Advanced Python");
        savedBook.setAuthor("Guido van Rossum");
        savedBook.setPrice(600);

        BookStore updatedBook = addressController.putBook(savedBook);

        assertEquals("Advanced Python", updatedBook.getBook_name());
        assertEquals("Guido van Rossum", updatedBook.getAuthor());
        assertEquals(600, updatedBook.getPrice());
    }

    // UPDATE BOOK BY ID
    @Test
    public void testPutByID() {

        BookStore book = new BookStore("C", "Dennis", 300);

        BookStore savedBook = addressController.addBook(book);

        BookStore updatedBook =
                new BookStore("C++", "Bjarne", 500);

        BookStore result =
                addressController.putByid(savedBook.getId(), updatedBook);

        assertEquals("C++", result.getBook_name());
        assertEquals("Bjarne", result.getAuthor());
        assertEquals(500, result.getPrice());
    }

    // DELETE BOOK
    @Test
    public void testDelete() {

        BookStore book = new BookStore("HTML", "Tim", 200);

        BookStore savedBook = addressController.addBook(book);

        Long id = savedBook.getId();

        String result = addressController.delete(id);

        assertEquals("Book Deleted", result);

        Optional<BookStore> deletedBook =
                addressController.getByid(id);

        assertFalse(deletedBook.isPresent());
    }
}