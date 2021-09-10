package Homework1;

public class Book {
    private String genre;
    private int pages;

    public Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }

    public void toGenre(){
        System.out.println("The genre of this book is " + genre + "!");
    }

}
