package main.web.mvc;

public class Book {
    private String title;
    private String author;
    private long isbn;

    public Book() {
    }

    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}
