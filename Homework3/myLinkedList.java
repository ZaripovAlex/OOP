package Homework3;
//package org.example;
//
//
//import java.util.Iterator;
//
//public class myLinkedlist<T> implements Iterable{
//    private int size = 0;
//    private Node<T> first;
//    private Node<T> second;
//
//    public int getSize() {
//        return size;
//    }
//
//    public Node<T> getFirst() {
//        return first;
//    }
//
//    public myLinkedlist add(myLinkedlist list, T data){
//        Node newNode = new Node<T>(data,null);
//        if (list.first == null){
//            list.first = newNode;
//        } else {
//             list.second= list.first;
//             list.first = newNode;
//        }
//    return list;
//    }
//
//    @Override
//    public Iterator<T> iterator() {
//        return new LLIterator<T>(this);
//    }
//
//
//    protected  class LLIterator<T> implements Iterator<T> {
//
//    Node<T> node;
//    public  LLIterator(myLinkedlist<T> list){
//        node = list.getFirst();
//    }
//    @Override
//    public boolean hasNext() {
//        return node !=null;
//    }
//
//    @Override
//    public T next() {
//        T date = node.getDate();
//        node = node.getLink();
//        return date;
//    }   }}
//
//
//
//


import java.util.Iterator;

public class myLinkedList<T> implements Iterable<T> {
    private Node<T> first;
    private Node<T> second;

    public void add(T data) {
        Node<T> node = new Node<T>(data, null);
        if (first == null) {
            first = second =node;
//            second = node;
        }else {
            second.setLink(node);
            second = node;
        }
    }
    public Node<T> getHead() {
        return first;
    }

    public Node<T> getSecond() {
        return second;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this);
    }


}