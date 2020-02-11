package pl.library.app;

import pl.library.io.DataReader;
import pl.library.model.Book;
import pl.library.model.Library;
import pl.library.model.Magazine;

public class LibraryControl {

    private DataReader dataReader = new DataReader();
    private Library library = new Library();   // pole kasy

    public void controlLoop(){
        Option option;

        do{
            printOptions();
            option = Option.createFromInt(dataReader.getInt());

            switch (option){
                case EXIT:
                    break;
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
                    break;
                default:
                    System.out.println("Błędna opcja ");

            }
        } while(option != option.EXIT);

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
        for (Option value : Option.values()) {
            System.out.println(value);
        }
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

