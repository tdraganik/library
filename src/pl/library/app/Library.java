package pl.library.app;

import pl.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v7.0";

        Book[] books = new Book[1000];

        books[0] = new Book("W pustyni i w puszczy","Henryk Sienkiewicz",
                2010,296, "Greg", "353453346344535");
        books[1] = new Book("Ogniem i mieczem", "Henryk Sienkiewicz",
                1996,356, "Relaskow", "474242424234");
        books[2] = new Book("Efektywne prograowaie w JAVA", "Jan Kowalski",
                2015,789, "TomekSjc");

        System.out.println(appName);
        System.out.println("Książki dostąpne w bibliotece: ");

        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();

    }
}
