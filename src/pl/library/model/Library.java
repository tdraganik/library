package pl.library.model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINE = 1000;

    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINE];

    private int booksNumber = 0;
    private int magazinesNumber = 0;


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

    public void addMagazine(Magazine magazine) {
        if (magazinesNumber < MAX_MAGAZINE) {
            magazines[magazinesNumber] = magazine;
            magazinesNumber ++;
        }else
            System.out.println("Nie można już dodać wiecej magazynów");
    }

    public void printMagazines(){
        if(magazinesNumber == 0) {
            System.out.println("Brak jest magazynów w bibliotece");

        }
        for (int i = 0; i < magazinesNumber; i++) {
            magazines[i].printInfo();
        }
        System.out.println("Obecnie jest: " + magazinesNumber + " magazynów w bibliotece" );
    }


}
