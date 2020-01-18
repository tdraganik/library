package pl.library.io;

import pl.library.model.Book;
import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

   public Book readAndCreateBook(){
        System.out.println("Tyruł ");
        String title = sc.nextLine();

        System.out.println("Autor ");
        String author = sc.nextLine();

        System.out.println("Wydawnictwo ");
        String publisher = sc.nextLine();

        System.out.println("ISBN ");
        String isbn = sc.nextLine();

        System.out.println("Rok wydania ");
        int relaseDate = sc.nextInt();
        sc.nextLine();

        System.out.println("Liczba stron ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author,relaseDate, pages,  publisher, isbn);
    }
    public void close(){
        sc.close();
    }

}
