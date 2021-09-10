package Homework1;

public class TestBook {
    public static void main(String []args){
        Book book1 = new Book("fantasy", 283);
        Book book2 = new Book("romanсe", 385);
        Book book3 = new Book("dictionary", 987);
        book3.setPages(205);
        book3.setGenre("horror");
        book1.toGenre();
        book2.toGenre();
        book3.toGenre();
    }
}
