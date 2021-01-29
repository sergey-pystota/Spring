package by.teachmeskills.springboot.model.books;


import by.teachmeskills.springboot.model.AbstractModel;

public class BookModel extends AbstractModel {
    private String author;
    private String title;
    private String description;
    private double price;

    public BookModel(String author, String title, String description, double price) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public BookModel() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
