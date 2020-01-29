package pl.library.model;

public class Library {

    private static final int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber = 0;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];


    public void addBook(Book book) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = book;
            publicationsNumber++;
        } else
            System.out.println("Nie można już dodać wiecej ksiązek");
    }

    public void printBook() {
        int countBooks = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Book)
                publications[i].printInfo();
            countBooks++;
        }
        if (countBooks == 0) {
            System.out.println("Brak jest książek w bibliotece");
        }
        System.out.println("Obecnie jest: " + countBooks + " książek w bibliotece");
    }

    public void addMagazine(Magazine magazine) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = magazine;
            publicationsNumber++;
        } else
            System.out.println("Nie można już dodać wiecej magazynów");
    }

    public void printMagazines() {
        int coutMagazines = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if(publications[i] instanceof Magazine)
                publications[i].printInfo();
            coutMagazines ++;
        }
        if (coutMagazines == 0) {
            System.out.println("Brak jest magazynów w bibliotece");
        }
        System.out.println("Obecnie jest: " + coutMagazines + " magazynów w bibliotece");
    }


}
