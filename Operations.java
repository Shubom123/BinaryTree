package com.binarytree;

public class Operations {
    public static void add(){
        Tree<Integer> tree = new Tree<>();
        Node root = new Node(56);
        System.out.println("Building tree with root value " + root.key);
        tree.insert(root,30);
        tree.insert(root,70);
        tree.traversal(root);
    }
}
