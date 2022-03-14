package czw.model;

import java.util.Objects;

public class Chinese {
    private Integer id;
    private String name;
    private String author;
    private Float price;
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
        if (!(o instanceof Chinese)) return false;
        Chinese chinese = (Chinese) o;
        return Objects.equals(id, chinese.id) && Objects.equals(name, chinese.name) && Objects.equals(author, chinese.author) && Objects.equals(price, chinese.price) && Objects.equals(description, chinese.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, price, description);
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

