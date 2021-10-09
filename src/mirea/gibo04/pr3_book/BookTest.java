package mirea.gibo04.pr3_book;

public class BookTest {
    public static void main(String[] args) {
        Book[] book = new Book[3];
        Book book1 = new Book("Sapiens", 2011, "Y. Harari");
        Book book2 = new Book("War and Peace", 1865, "L. Tolstoy");
        Book book3 = new Book("Islands in the Stream", 1970 , "E. Hemingway");

        book1.bookInfo();
        System.out.println();
        book2.bookInfo();
        System.out.println();
        book3.bookInfo();


    }
}
