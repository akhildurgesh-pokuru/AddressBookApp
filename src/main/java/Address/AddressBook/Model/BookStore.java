package Address.AddressBook.Model;

import jakarta.persistence.*;

@Entity
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_name")
    private String book_name;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    private double price;

    // Parameterized constructor
    public BookStore(String book_name, String author, double price) {
        this.book_name = book_name;
        this.author = author;
        this.price = price;
    }

    // Default constructor
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