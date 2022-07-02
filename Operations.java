package com.binarytree;
import java.util.Scanner;

public class Operations {
    public static void addAndSearch(){
        Tree<Integer> tree = new Tree<>();
        Node root = new Node(56);
        System.out.println("Building tree with root value " + root.key);
        tree.insert(root,30);
        tree.insert(root,70);
        tree.insert(root,22);
        tree.insert(root,40);
        tree.insert(root,60);
        tree.insert(root,95);
        tree.insert(root,11);
        tree.insert(root,65);
        tree.insert(root,3);
        tree.insert(root,16);
        tree.insert(root,63);
        tree.insert(root,67);
        tree.traversal(root);
        System.out.println("Enter a number you want to search in a tree");
        Scanner scanner=new Scanner(System.in);
        int data = scanner.nextInt();
        tree.search(root,data);
        System.out.println("We found the number: "+ data);
    }
}
