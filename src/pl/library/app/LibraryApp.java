package pl.library.app;

class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v 9.0";
        System.out.println(appName);

        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
