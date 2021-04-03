package exo2et3;

import java.util.LinkedHashMap;
import java.util.Objects;

public class Library {
    // private final ArrayList<Book> books;
    private final LinkedHashMap<String, Book> books;

    /**
     * Constructor
     */
    public Library() {
        //this.books = new ArrayList<>();
        this.books = new LinkedHashMap<>();
    }

    /**
     * add a book to the library
     *
     * @param book the book to be added
     */
    public void add(Book book) {
        // books.add(Objects.requireNonNull(book));
        Objects.requireNonNull(book);
        books.put(book.title(), book);
    }

    /*
      public exo2.Book findByTitle(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #10                 // Field books:Ljava/util/ArrayList;
       4: invokevirtual #28                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
       7: astore_2
       8: aload_2
       9: invokeinterface #32,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      14: ifeq          43
      17: aload_2
      18: invokeinterface #38,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: checkcast     #22                 // class exo2/Book
      26: astore_3
      27: aload_3
      28: invokevirtual #42                 // Method exo2/Book.title:()Ljava/lang/String;
      31: aload_1
      32: invokevirtual #46                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      35: ifeq          40
      38: aload_3
      39: areturn
      40: goto          8
      43: aconst_null
      44: areturn
     */

    /**
     * Complexité O(n) avec ArrayList, O(1) avec HashMap
     * <p>
     * Find a book depending on the given title
     *
     * @param title the given title
     * @return the book with the corresponding title, null otherwise
     */
    public Book findByTitle(String title) {
        /*
        for (Book book : books) {
            if (book.title().equals(title)) return book;
        }

        return null;
         */

        return books.get(title);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("Cette librairie contient les ouvrages suivants: \n");

        /*
        for (Book book : books) {
            sb.append(book.toString()).append("\n");
        }
        */

        for (Book book : books.values()) {
            sb.append(book.toString()).append("\n");
        }

        return sb.toString();
    }

    public void removeAllBooksFromAuthor(String author) {
        /* java.util.ConcurrentModificationException
        books.forEach((title, book) -> {
            if (book.author().equals(author)) {
                books.remove(title);
            }
        });

        var iterator = books.entrySet().iterator();

        while (iterator.hasNext()) {
            var entry = iterator.next();
            if (entry.getValue().author().equals(author)) {
                iterator.remove();
            }
        }
        */

        books.entrySet().removeIf(entry -> entry.getValue().author().equals(author));

    }

    public static void main(String[] args) {
        var book = new Book("test", "bob");
        var book2 = new Book("test1", "bob");
        var book3 = new Book("test2", "bob2");
        var book4 = new Book("test3", "bob3");
        var book5 = new Book("test4", "bob4");
        var book6 = new Book("test5", "bob5");

        var library = new Library();
        library.add(book);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);

        library.removeAllBooksFromAuthor("bob");

        var library2 = new Library();
        library2.add(new Book("Da Vinci Code", "Dan Brown"));
        library2.add(new Book("Angels & Demons", "Dan Brown"));
        library2.removeAllBooksFromAuthor("Dan Brown");

        System.out.println(library.toString());
        System.out.println(library2.toString());
        ;
    }
}
