package fr.umlv.cooperative;

sealed interface Fruit permits Apple, Pear{
    int price();
}
