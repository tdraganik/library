package pl.library.app;

class LibraryApp {

    private static final String APP_NAME = "Biblioteka v 17.0";
    public static void main(String[] args) {

        System.out.println(APP_NAME);

        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
