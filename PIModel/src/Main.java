import pi.pkg.Book;
import pi.pkg.Shelf;

public class Main {

    public static void main(String[] args) {

//        Author a = new Author("name");
//        System.out.println(a);
        Book book = new Book("book","10-10-1992","descr","onet,two,three", "John");
        Book book2 = new Book("book2","10-10-1992","descr","one,two,three", "John");
        book.delete(book.getAuthor(), book.getCategories());
//        book.update("book2","10-10-1992","descr","onet,two,three", "John");
        System.out.println(book);
        System.out.println(book2);
//        System.out.println(book.getAuthor());
//        System.out.println(book2.getAuthor());
//        System.out.println(pi.pkg.Shelf.getAuthorsArray());
        System.out.println(Shelf.getCategoriesArray());
        System.out.println(Shelf.getBooksArray());
        System.out.println("-".repeat(30));
        System.out.println(Shelf.getCategoriesArray());
    }
}
