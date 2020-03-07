package pl.library.app;

import pl.library.Exception.NoSuchOptionException;
import pl.library.io.ConsolePrinter;
import pl.library.io.DataReader;
import pl.library.model.Book;
import pl.library.model.Library;
import pl.library.model.Magazine;
import pl.library.model.Publication;
import java.util.InputMismatchException;

public class LibraryControl {

    private ConsolePrinter printer= new ConsolePrinter();
    private DataReader dataReader = new DataReader(printer);
    private Library library = new Library();   // pole klasy

    public void controlLoop(){
        Option option;

        do{
            printOptions();
            option = getOption();

            switch (option){
                case EXIT:
                    exit();
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
                    printMagazines();
                    break;
                default:
                    printer.printLine("Błędna opcja ");

            }
        } while(option != Option.EXIT);

    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while(!optionOk){
            try{
               option = Option.createFromInt(dataReader.getInt());
               optionOk = true;
            }catch(NoSuchOptionException e){
               printer.printLine(e.getMessage());
            }catch(InputMismatchException e){
                printer.printLine("Wprowadzono wartość która nie jest liczbą spróbuj pnownie");
            }
        }
        return option;
    }

    private void printMagazines() {
        Publication[] publications = library.getPublications();
        printer.printMagazines(publications);
    }

    private void addMagazine() {
        try{
            Magazine magazine = dataReader.readAndCreateMagazine();
            library.addMagazine(magazine);
        } catch (InputMismatchException e){
            printer.printLine("Nie udał osię dodać magazynu, podałeś niprawidłowe dane.");
        }  catch(ArrayIndexOutOfBoundsException e){
            printer.printLine("Przekroczyłeś dopuszczalną ilość magazynóœ ");
        }
    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        printer.printBooks(publications);
    }

    private void addBook() {
        try{
            Book book = dataReader.readAndCreateBook();
            library.addBook(book);
        } catch(InputMismatchException e ){
            printer.printLine("Nie udało się dodać książki, podałeś nieprawidłowe dane");
        } catch(ArrayIndexOutOfBoundsException e){
            printer.printLine("Przekroczyłeś dopuszczalną ilość książek ");
        }
    }

    private void exit() {
        printer.printLine("Koniec programu, dziękujęmy !!! ");
        dataReader.close();
    }

    private void printOptions() {
        printer.printLine("Wybierz opcję:");
        for (Option value : Option.values()) {
            printer.printLine(value.toString());
        }   // value nie jest stringien dlatego trzeba parsować
    }
    private enum Option {
        EXIT(0, " Wyjście z programu"),
        ADD_BOOK(1, " Dodanie nowej ksiązki"),
        ADD_MAGAZINE(2, " Dodanie nowego magazynu"),
        PRINT_BOOKS(3, " Wyświetl dostępne książki"),
        PRINT_MAGAZINE(4, " Wyświetl dostępne magazyny");

        private final int value;
        private final String description;

        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        public int getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return value + " - " +  description ;
        }

        // metda przekształcająca string na int czyli ENUM na liczbę

        static Option createFromInt(int option) throws NoSuchOptionException {
            try{
                return Option.values()[option];
            } catch(ArrayIndexOutOfBoundsException e){
                throw new NoSuchOptionException("Brak opcji o id  " + option);
// wymuszona obsluga wyjątku kontrolowanego NoSuchOptionException
            }
        }
    }
}

