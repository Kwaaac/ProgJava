package fr.umlv.fight;

public class MainExo1 {

    /*
    * Le book.title n'est pas accessible car nous ne somme pas dans la classe book, il faut passer par les getters.
    *
    * */
    public static void main(String[] args) {
        var book = new Book("Da Vinci Code", "Dan Brown");
        //var weirdBook = new Book(null, "oops");
        System.out.println(book.title() + ' ' + book.author());
        //System.out.println(weirdBook.title() + ' ' + weirdBook.author());
    }
}
