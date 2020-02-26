public class Book {
    private final String title, author;

    public Book(String title, String author) {
        if (title == null || author == null)
            throw new NullPointerException();

        this.title = title;
        this.author = author;
    }

    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof Book))
            return false;

        Book book = (Book)other;
        return title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode() * 7;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }

    public static void main(String... args) {
        Book book1 = new Book("Nineteen eighty-four", "George Orwell");
        Book book2 = new Book("Nineteen eighty-four", "George Orwell");
        Book book3 = new Book("Moby-Dick", "Herman Melville");
        Book book4 = book3;

        System.out.println(book1 == book2);      // false
        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false
        System.out.println(book3 == book4);      // true
    }
}
