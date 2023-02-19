//package org.example;
//
//public class Node<T> {
//    private T date;
//    private Node<T> link;
//
//    public Node(T date, Node<T> link) {
//        this.date = date;
//        this.link = link;
//    }
//
//    public T getDate() {
//        return date;
//    }
//
//    public Node<T> getLink() {
//        return link;
//    }
//
//    public void setLink(Node<T> link) {
//        this.link = link;
//    }
//
//    @Override
//    public String toString() {
//        return "Date: "+date;
//    }
//}
package Homework3;

public class Node<T> {
    private T inf;
    private Node<T> link;

    public Node(T inf, Node<T> link) {
        this.inf = inf;
        this.link = link;
    }

    public T getInf() {
        return inf;
    }

    public Node<T> getLink() {
        return link;
    }

    public void setLink(Node<T> link) {
        this.link = link;
    }

    @Override
    public String toString() {
       return  " >> "+inf;
    }
}