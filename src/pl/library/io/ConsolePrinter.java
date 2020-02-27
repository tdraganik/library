package pl.library.io;

import pl.library.model.Book;
import pl.library.model.Magazine;
import pl.library.model.Publication;

public class ConsolePrinter {
    public void printBooks(Publication[] publications) {
        int countBooks = 0;
        for (Publication publication : publications) {
            if (publication instanceof Book)
                System.out.println(publication);
            countBooks++;
        }

        if (countBooks == 0) {
            printLine("Brak jest książek w bibliotece");
        }
        printLine("Obecnie jest: " + countBooks + " książek w bibliotece");
    }

    public void printMagazines(Publication[] publications) {
        int coutMagazines = 0;
        for (Publication publication : publications) {
            if (publication instanceof Magazine)
                System.out.println(publication);
            coutMagazines++;
        }
        if (coutMagazines == 0) {
            printLine("Brak jest magazynów w bibliotece");
        }
        printLine("Obecnie jest: " + coutMagazines + " magazynów w bibliotece");
    }

    public void printLine(String text) {
        System.out.println(text.toUpperCase());
    }
}
