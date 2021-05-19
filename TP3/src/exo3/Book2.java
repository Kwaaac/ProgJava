package exo3;

import java.util.Objects;

public class Book2 {
    private final String title;
    private final String author;

    public Book2(String title, String author) {
        this.title = Objects.requireNonNull(title);
        this.author = Objects.requireNonNull(author);
    }

    public static void main(String[] args) {
        /*
        * 1.
        * L'égalité est à False alors qu'ils ont le même contenu et qu'on utilise la méthode equals
        *
        * 2.
        * Il faut redéfinir les méthodes equals et hashcode afin de pouvoir effectuer une égalité sur le sous-type Book2
        *
        */

        var book1 = new Book2("Da Vinci Code", "Dan Brown");
        var book2 = new Book2("Da Vinci Code", "Dan Brown");
        System.out.println(book1.equals(book2));
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Book2)){
            return false;
        }
        Book2 book2 = (Book2) o;
        return title.equals(book2.title) && author.equals(book2.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
