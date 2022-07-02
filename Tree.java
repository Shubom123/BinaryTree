package com.binarytree;

public class Tree<T extends Comparable<T>> {

    public Node insert(Node current, T key){
        if(current==null){
            return new Node<>(key);
        }
        int compareResult = key.compareTo((T) current.key);
        if(compareResult==0){
            return current;
        }if(compareResult<0){
           current.left=insert(current.left, key);
           System.out.println("Value "+current.left.key+" is inserted left of "+current.key+" node.");
        }else {
            current.right=insert(current.right, key);
            System.out.println("Value "+current.right.key+" is inserted right of "+current.key+" node.");
        }
        return current;
    }
    public void traversal(Node root) {
        if(root!=null){
            traversal(root.left);
            System.out.println(" " + root.key);
            traversal(root.right);
        }
    }
    public Node search(Node current, T key){
        if(current==null){
            System.out.println("Tree is empty");
        }
        int compareResult = key.compareTo((T) current.key);
        if(compareResult==0){
            return current;
        } else if (compareResult<0) {
            return search(current.left, key);
        } else {
            return search(current.right,key);
        }
    }
}
