package pi.pkg;

public class Category {

    private int categoryId;
    private String categoryName;

    Category(String categoryName) {
        this.categoryId = Shelf.getCategoriesArray().size();
        this.categoryName = categoryName;
    }

    public boolean update(String categoryName, String newName) {

        Category category = Shelf.findCategory(categoryName);
        if (category != null) {
            this.categoryName = newName;
            return true;
        }
        return false;
    }

    public void delete() {

        for (Book book : Shelf.getBooksArray()) {

            for (Category c : book.getCategories()) {

                if (c.equals(this)) {
                    return;
                }
            }
        }
        Shelf.getCategoriesArray().remove(this);
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "(ID: %d, Name: %s)".formatted(getCategoryId(), getCategoryName());
    }
}
