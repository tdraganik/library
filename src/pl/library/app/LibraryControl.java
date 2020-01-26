package pl.library.app;

import pl.library.io.DataReader;
import pl.library.model.Book;
import pl.library.model.Library;
import pl.library.model.Magazine;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int ADD_MAGAZINE = 2;
    private static final int PRINT_BOOKS = 3;
    private static final int PRINT_MAGAZINE = 4;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();   // pole kasy

    public void controlLoop(){
        int option;

        do{
            printOptions();
            option = dataReader.getInt();

            switch (option){

                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINE:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Błędna opcja ");

            }
        } while(option != EXIT);

    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję:");
        System.out.println(EXIT + " Wyjście z programu");
        System.out.println(ADD_BOOK + " Dodanie nowej ksiązki");
        System.out.println(ADD_MAGAZINE + " Dodanie nowego magazynu");
        System.out.println(PRINT_BOOKS +" Wyświetl dostępne książki");
        System.out.println(PRINT_MAGAZINE +" Wyświetl dostępne magazyny");
    }

    private void printBooks() {
        library.printBook();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }
    private void exit() {
        System.out.println("Koniec programu, dziękujęmy !!! ");
        dataReader.close();
    }

}

