package pl.library.app;

import pl.library.io.DataReader;
import pl.library.model.Book;
import pl.library.model.Library;

public class LibraryControl {

    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();   // pole kasy

    public void controlLoop(){
        int option;

        do{
            printOptions();
            option = dataReader.getInt();

            switch (option){

                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Błędna opcja ");

            }
        } while(option != exit);

    }

    private void printOptions() {
        System.out.println("Wybierz opcję:");
        System.out.println(exit + " wyjście z programu");
        System.out.println(addBook + " dodanie nowej ksiązki");
        System.out.println(printBooks +" wyświetl dostępne książki");
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

