package fr.umlv.data;


public class LinkedLink<T> {

    private Link<T> headLink;

    public void add(T value) {
        headLink = new Link<T>(value, headLink);
    }

    public T get(int index) {
        var lnk = headLink;

        for (int i = 0; lnk != null; lnk = lnk.next(), i++) {
            if (i == index) {
                return lnk.elt();
            }
        }

        throw new IllegalArgumentException("Bad index");
    }

    public boolean contains(Object o) {
        for (var lnk = headLink; lnk != null; lnk = lnk.next()) {
            if (lnk.elt().equals(o)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "LinkedLink: [" + headLink.toString() + "]";
    }
}
