package fr.umlv.data.main;

import fr.umlv.data.LinkedLink;

public class Main {
    public static void main(String[] args) {
        var lst = new LinkedLink();

        lst.add(13);
        lst.add(14);

        System.out.println(lst);
    }
}
