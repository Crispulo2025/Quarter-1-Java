public class Book {
    // attributes
    String title;
    String author;

    // constructor to initialize attributes
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // method to display book information
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        // create a Book object
        Book myBook = new Book("Java Programming", "Cris Maranan");

        // display the book information
        myBook.displayInfo();
    }
}
