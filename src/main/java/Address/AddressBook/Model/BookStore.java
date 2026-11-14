package Address.AddressBook.Model;

import jakarta.persistence.*;

@Entity
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "book_name")
    String book_name;

    @Column(name = "author")
    String author;

    @Column(name = "price")
    double price;

    public BookStore(Long id, String book_name, String author, double price) {
        this.id = id;
        this.book_name = book_name;
        this.author = author;
        this.price = price;
    }

    public BookStore() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
