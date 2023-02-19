package Homework3;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    Node<T> current;

    public MyIterator(myLinkedList<T> ts) {
        current = ts.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.getInf();
        current = current.getLink();
        return data;
    }

}