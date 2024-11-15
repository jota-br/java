package pi.pkg;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

    private static List<Book> booksArray = new ArrayList<>(100);
    private static List<Category> categoriesArray = new ArrayList<>(100);
    private static List<Author> authorsArray = new ArrayList<>(100);

    public static Category findCategory(String categoryName) {

        for (Category c : categoriesArray) {
            if (c.getCategoryName().equalsIgnoreCase(categoryName)) {
                return c;
            }
        }
        return null;
    }

    public static Author findAuthor(String authorName) {

        for (Author a : authorsArray) {
            if (a.getAuthorName().equalsIgnoreCase(authorName)) {
                return a;
            }
        }
        return null;
    }

    public static Book findBook(String bookName) {

        for (Book b : booksArray) {
            if (b.getTitle().equalsIgnoreCase(bookName)) {
                return b;
            }
        }
        return null;
    }

    public static List<String> splitCategories(String categories) {

        return new ArrayList<>(List.of(categories.split(",")));
    }

    public static List<Category> getCategoriesArray() {
        return categoriesArray;
    }

    public static List<Author> getAuthorsArray() {
        return authorsArray;
    }

    public static List<Book> getBooksArray() {
        return booksArray;
    }
}
