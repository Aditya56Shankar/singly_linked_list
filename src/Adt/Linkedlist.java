package Adt;

import node.Node;

public interface Adt {


        boolean isEmpty();

        int getSize();

        void add(int data);

        int remove(int data);

        Node search(int data);

        void print();
    }


