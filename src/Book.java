class Book {

    String title;
    String author;
    int releasedate;
    int pages;
    String publisher;
    String isbn;

        Book(String title, String author, int releasedate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releasedate = releasedate;
        this.pages = pages;
        this.publisher = publisher;
    }

        Book(String title, String author, int releasedate, int pages, String publisher, String isbn) {
        this(title, author, releasedate, pages, publisher );
        this.isbn = isbn;
    }

    void printInfo() {
        String info = title + "; " + author + "; " + releasedate + "; " + pages + "; " + publisher + "; " + isbn;
         System.out.println(info);
    }
}
