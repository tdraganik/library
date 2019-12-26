import java.sql.SQLOutput;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v1.0";

        String title = "W pustyni i w puszczy";
        String author = "Henryk Sienkiewicz";
        int releasedate = 2010;
        int pages = 296;
        String publisher = "Greg";
        String isbn = "353453346344535";

        System.out.println(appName);
        System.out.println("Książki dostąpne w bibliotece: ");
        System.out.println(title);
        System.out.println(author);
        System.out.println(releasedate);
        System.out.println(pages);
        System.out.println(publisher);
        System.out.println(isbn);

    }
}
