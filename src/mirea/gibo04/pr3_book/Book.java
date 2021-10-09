package mirea.gibo04.pr3_book;


public class Book {
    private String name;
    private int publishYear;
    private String author;

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга: " + name + "\nАвтор: " + author + "\nГод публикации: " + publishYear;
    }

    public void bookInfo() {
        System.out.println("Книга: " + name + "\nАвтор: " + author + "\nГод публикации: " + publishYear);
    }

    public int getPublicationYear(){
        return publishYear;
    }
}

