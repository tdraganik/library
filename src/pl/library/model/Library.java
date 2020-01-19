package pl.library.model;

public class Library {

    private static final int MAX_BOOKS = 1000;

    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber = 0;


    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
                books[booksNumber] = book;
                booksNumber++;
        }else
            System.out.println("Nie można już dodać wiecej ksiązek");
    }

    public void printBook(){
        if(booksNumber == 0) {
            System.out.println("Brak jest książek w bibliotece");

        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
        System.out.println("Obecnie jest: " + booksNumber + " książek w bibliotece" );
    }


}
