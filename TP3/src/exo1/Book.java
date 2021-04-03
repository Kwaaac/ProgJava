package exo1;

import java.util.Objects;

public record Book(String title, String author) {

    /*
    public Book(String title, String author){
        this.title = Objects.requireNonNull(title);
        this.author = Objects.requireNonNull(author);
    }
    */

    public Book{
        Objects.requireNonNull(title);
        Objects.requireNonNull(author);
    }

    /*
     * Le compilateur nsait comment récupérer le bon constructeur grâce à la surcharge.
     * Il va regarder le nombre de paramètres et leurs types et récuperer le bon constructeur en fonction.
     */

    public Book(String title) {
        this(title, "<no author>");
    }

    /* Le code donner ne fonctionne pas car les composants des record sont immuable.
    * Le seul moyen est de renvoyer un nouveau Book avec le titre mis à jour  */
    public Book withTitle(String title) {
        return new Book(title, this.author);
    }

    public boolean isFromTheSameAuthor(Book book) {
        return author.equals(book.author);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    public static void main(String[] args) {
        var book = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(book.title + ' ' + book.author);
    }
}
