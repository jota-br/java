package pi.pkg;

public class Author {

    private int authorId;
    private String authorName;

    Author(String authorName) {
        this.authorId = Shelf.getAuthorsArray().size();
        this.authorName = authorName;
    }

    public boolean update(String authorName, String newName) {

        Author author = Shelf.findAuthor(authorName);
        if (author != null) {
            this.authorName = newName;
            return true;
        }
        return false;
    }

    public void delete() {

        for (Book book : Shelf.getBooksArray()) {

            if (book.getAuthor().equals(this)) {
                return;
            }
        }
        Shelf.getAuthorsArray().remove(this);
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Author getAuthor() {
        return this;
    }

    @Override
    public String toString() {
        return "ID: %d, Name: %s".formatted(getAuthorId(), getAuthorName());
    }
}
