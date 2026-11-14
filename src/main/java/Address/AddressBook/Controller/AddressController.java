package Address.AddressBook.Controller;

import Address.AddressBook.AddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/home")
    public String home(){
        return "This is Address Book App";
    }

    @PostMapping("/add")
    public AddressBook addBook(@RequestBody AddressBook book){
        return addressService.addBook(book);
    }

    @GetMapping("/get")
    public List<AddressBook> getBooks(){
        return addressService.getBooks();
    }

    @GetMapping("/getByID/{id}")
    public Optional<AddressBook> getByid(@RequestParam Long id){
        return addressService.getByID(id);
    }

    @PutMapping("/put")
    public AddressBook putBook(@RequestBody AddressBook book){
        return addressService.change(book);
    }

    @PutMapping("/putByID/{id}")
    public AddressBook putByid(@RequestParam Long id){
        return addressService.putByID(id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@RequestParam Long id){
         addressService.delete(id);
         return "Book Deleted";
    }
}
