package pl.library.model;

public class Book {

    private String title;
    private String author;
    private int releasedate;
    private int pages;
    private String publisher;
    private String isbn;

        public Book(String title, String author, int releasedate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releasedate = releasedate;
        this.pages = pages;
        this.publisher = publisher;
    }

        public Book(String title, String author, int releasedate, int pages, String publisher, String isbn) {
        this(title, author, releasedate, pages, publisher );
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(int releasedate) {
        this.releasedate = releasedate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releasedate + "; " + pages + "; " + publisher;
        if( isbn != null){
            info = info + "; "+ isbn;
        }

         System.out.println(info);
    }
}
