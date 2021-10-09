package mirea.gibo04.pr3_book;

import java.util.*;

public class BookShelf {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        int count = 1;


        // ввод данных о книгах
        for (int i = 0; i < books.length; i++) {
            System.out.println("Введите название, год и автора " + count + "-й книги, которую хотите поместить на полку");
            String name = new Scanner(System.in).nextLine();
            int year = new Scanner(System.in).nextInt();
            String author = new Scanner(System.in).nextLine();
            books[i] = new Book(name, year, author);
            count++;
        }

        System.out.println("------Книжная полка------");
        // вывод информации о книгах
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }

        int min = 0;
        int max = 0;
        for (int i = 0; i < books.length; i++){
            if (min > books[i].getPublicationYear()){
                min = i;
            }
            if (min < books[i].getPublicationYear()){
                max = i;
            }
        }
        System.out.println();
        System.out.println("Самая старая книга на полке: " + books[min].getPublishYear() + " года. Ее название \"" + books[min].getName() + "\"");
        System.out.println("Самая новая книга на полке " + books[max].getPublishYear() + " года. Это \"" + books[max].getName()+ "\"");
        System.out.println();

        // сортировка по году (от большего к меньшему)
        for (int i = 0; i < books.length; i++) {
            for(int j = 0; j < books.length; j++){
                if (books[i].getPublishYear() < books[j].getPublishYear()){
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }

        System.out.println("-------Порядок книг от самой старой до самой новой-------");
        // вывод отсортированных списков
        int count1 = 1;
        for (int i = 0; i < books.length; i++){
            System.out.println("");
            System.out.println(books[i]);
        }
    }
}