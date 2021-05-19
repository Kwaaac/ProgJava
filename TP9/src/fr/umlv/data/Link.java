package fr.umlv.data;

import java.util.ArrayList;

record Link(int elt) {
    @Override
    public String toString() {
        return String.valueOf(elt);
    }

    /*Q2, il faut utilise javac sur le .java puis java sur le .class*/
    public static void main(String[] args) {
        var lst = new ArrayList<Link>();
        lst.add(new Link(13));
        lst.add(new Link(14));
    }
}

