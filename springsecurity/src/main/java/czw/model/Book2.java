package czw.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "jpa_book")
public class Book2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book2_name",nullable = false)
    private String name;
    private String author;
    private Float price;

    @Transient
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book2)) return false;
        Book2 book2 = (Book2) o;
        return Objects.equals(id, book2.id) && Objects.equals(name, book2.name) && Objects.equals(author, book2.author) && Objects.equals(price, book2.price) && Objects.equals(description, book2.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, price, description);
    }

    @Override
    public String toString() {
        return "Book2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
