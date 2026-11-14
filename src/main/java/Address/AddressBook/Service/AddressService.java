package Address.AddressBook.Service;

import Address.AddressBook.Model.BookStore;
import Address.AddressBook.Repository.AddressRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepo addressRepo;

    public AddressService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    public BookStore addBook(BookStore book) {
        return addressRepo.save(book);
    }

    public List<BookStore> getBooks() {
        return addressRepo.findAll();
    }

    public Optional<BookStore> getByID(Long id) {
        return addressRepo.findById(id);
    }

    public BookStore change(BookStore book) {
        BookStore b = addressRepo.findById(book.getId())
                .orElse(new BookStore());

        b.setBook_name(book.getBook_name());
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());

        return addressRepo.save(b);
    }

    public BookStore putByID(Long id, BookStore book) {
        BookStore b = addressRepo.findById(id)
                .orElse(new BookStore());

        b.setBook_name(book.getBook_name());
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());

        return addressRepo.save(b);
    }

    public void delete(Long id) {
        addressRepo.deleteById(id);
    }
}