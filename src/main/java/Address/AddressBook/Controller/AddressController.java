package Address.AddressBook.Controller;

import Address.AddressBook.Model.BookStore;
import Address.AddressBook.Service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/home")
    public String home() {
        return "This is Address Book App";
    }

    @PostMapping("/add")
    public BookStore addBook(@RequestBody BookStore book) {
        return addressService.addBook(book);
    }

    @GetMapping("/get")
    public List<BookStore> getBooks() {
        return addressService.getBooks();
    }

    @GetMapping("/getByID/{id}")
    public Optional<BookStore> getByid(@PathVariable Long id) {
        return addressService.getByID(id);
    }

    @PutMapping("/put")
    public BookStore putBook(@RequestBody BookStore book) {
        return addressService.change(book);
    }

    @PutMapping("/putByID/{id}")
    public BookStore putByid(@PathVariable Long id,
                             @RequestBody BookStore bookStore) {
        return addressService.putByID(id, bookStore);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        addressService.delete(id);
        return "Book Deleted";
    }
}