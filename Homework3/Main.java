package Homework3;

public class Main {
    public static void main(String[] args) {
        myLinkedList<Integer> my = new myLinkedList<>();
        my.add(1);
        my.add(2);
        my.add(3);
        my.add(4);
        my.add(5);


        for ( Integer st: my){
            System.out.println(st);
        }

    }
}