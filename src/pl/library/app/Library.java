package pl.library.app;

import pl.library.io.DataReader;
import pl.library.model.Book;
import java.util.Scanner;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v8.0";

        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[1000];


        DataReader dataReader = new DataReader();
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

//        books[0] = new Book("W pustyni i w puszczy","Henryk Sienkiewicz",
//                2010,296, "Greg", "353453346344535");
//        books[1] = new Book("Ogniem i mieczem", "Henryk Sienkiewicz",
//                1996,356, "Relaskow", "474242424234");
//        books[2] = new Book("Efektywne prograowaie w JAVA", "Jan Kowalski",
//                2015,789, "TomekSjc");

        System.out.println(appName);
        System.out.println("Książki dostąpne w bibliotece: ");

        books[0].printInfo();
        books[1].printInfo();


    }
}
