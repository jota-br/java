package pi.pkg;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int bookId;
    private String title;
    private String releaseDate;
    private String description;
    private List<Category> categories = new ArrayList<>();
    private Author author;

    public Book(String title, String releaseDate, String description, String categories, String authorName) {

        if (Shelf.findBook(title) != null) {
            return;
        }

        this.bookId = Shelf.getBooksArray().size();
        this.title = title;
        this.releaseDate = releaseDate;
        this.description = description;

        if (!categories.isEmpty() || !categories.isBlank()) {
            List<String> categoriesArray = Shelf.splitCategories(categories);

            for (String string : categoriesArray) {
                string = string.trim();
                Category category = Shelf.findCategory(string);
                if (category == null) {
                    Category newCategory = new Category(string);
                    this.categories.add(newCategory);
                    Shelf.getCategoriesArray().add(newCategory);
                } else {
                    this.categories.add(category);
                }
            }
        } else {
            this.categories = null;
        }

        if (!authorName.isBlank() || !authorName.isEmpty()) {

            for (Author a : Shelf.getAuthorsArray()) {
                if (a.getAuthorName().equalsIgnoreCase(authorName)) {
                    this.author = a;
                }
            }

            if (this.author == null) {
                this.author = new Author(authorName);
                Shelf.getAuthorsArray().add(this.author);
            }
            Shelf.getBooksArray().add(this);
        } else {
            this.author = null;
        }
    }

    public void update(String title, String releaseDate, String description, String categories, String authorName) {

        if (!categories.isEmpty() || !categories.isBlank()) {
            List<String> categoriesArray = Shelf.splitCategories(categories);

            this.categories.clear();

            for (String string : categoriesArray) {
                string = string.trim();
                Category category = Shelf.findCategory(string);
                if (category == null) {
                    Category newCategory = new Category(string);
                    this.categories.add(newCategory);
                    Shelf.getCategoriesArray().add(newCategory);
                } else if (!this.categories.contains(category)) {
                    this.categories.add(category);
                }
            }
        } else {
            this.categories = null;
        }

        this.title = title;
        this.releaseDate = releaseDate;
        this.description = description;

        Author author = Shelf.findAuthor(authorName);
        this.author = (author == null) ? new Author(authorName) : author;
    }

    public void delete(Author author, List<Category> categories) {

        Shelf.getBooksArray().remove(this);
        author.delete();
        for (Category c : categories) {
            c.delete();
        }
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {

        System.out.println("-".repeat(30));
        return "Book ID:  %d%nTitle: %s%nRelease Date: %s%nDescription: %s%nCategories: %s%nAuthor: %s".formatted(getBookId(), getTitle(), getReleaseDate(), getDescription(), getCategories(), getAuthor());
    }
}

