package Homework;

public class TestBook {
    public static void main(String []args){
        Book book1 = new Book("horror", 310);
        Book book2 = new Book("romanсe", 235);
        Book book3 = new Book("detective", 587);
        book3.setPages(115);
        book1.countPages();
        book2.countPages();
        book3.countPages();
    }
}
