package fr.umlv.data;

import java.util.LinkedList;

public class LinkedLink {
    private final LinkedList<Link> list= new LinkedList<>();

    public boolean add(int value){
        return list.add(new Link(value));
    }

    public Link get(int index){
        if(index < 0 || index > list.size()){
            throw new IndexOutOfBoundsException();
        }

        return list.get(index);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
