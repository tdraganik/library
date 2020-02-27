package pl.library.app;
import pl.library.Exception.NoSuchOptionException;

public enum Option {
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

