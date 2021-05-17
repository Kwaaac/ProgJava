package fr.umlv.cooperative;

public enum AppleKind {
    GOLDEN("Golden"),
    PINKLADY("Pink Lady"),
    GRANNYSMITH("Granny Smith");

    private final String name;

    AppleKind(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
