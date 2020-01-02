package pl.library.app;

import pl.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v6.1";

        Book book1 = new Book("W pustyni i w puszczy","Henryk Sienkiewicz",
                2010,296, "Greg", "353453346344535");
        Book book2 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz",
                1996,356, "Relaskow", "474242424234");
        Book book3 = new Book("Efektywne prograowaie w JAVA", "Jan Kowalski",
                2015,789, "TomekSjc");

        System.out.println(appName);
        System.out.println("Książki dostąpne w bibliotece: ");

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

    }
}
