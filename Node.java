package com.binarytree;

public class Node<T extends Comparable<T>> {
    T key;
    Node left;
    Node right;
    public Node(T key){
        this.key=key;
        left=null;
        right=null;
    }
}
