class Book {

    String title;
    String author;
    int releasedate;
    int pages;
    String publisher;
    String isbn;

    Book(String bookTitle, String bookAuthor,  int bookReleaseDate,
         int bookPages, String bookPublisher, String bookIsbn) {

        title = bookTitle;
        author = bookAuthor;
        releasedate = bookReleaseDate;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = bookIsbn;
    }
     void printInfo() {
        String info = title + "; " + author + "; " + releasedate + "; " + pages + "; " + publisher + "; " + isbn;
         System.out.println(info);
    }
}
