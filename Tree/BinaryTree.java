package com.impetus.tree;

class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTree {

    Node root;

    BinaryTree(){
        root = null;
    }

     void printpreorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.key+ " ");
        printpreorder(node.left);
        printpreorder(node.right);
    }

     void printinorder(Node node){
        if(node == null){
            return;
        }
        printinorder(node.left);
        System.out.print(node.key+ " ");
        printinorder(node.right);

    }

     void printPostorder(Node node){
        if(node == null){
            return;
        }
         printPostorder(node.left);
         printPostorder(node.right);
        System.out.print(node.key+ " ");
    }
    // Wrappers over above recursive functions
    void printPostorder()  {     printPostorder(root);  }
    void printInorder()    {     printinorder(root);   }
    void printPreorder()   {     printpreorder(root);  }

    public static void main(String[] args){

        BinaryTree b = new BinaryTree();
        b.root = new Node(1);
        b.root.left = new Node(3);
        b.root.right = new Node(4);
        b.root.left.left = new Node(5);
        b.root.left.right = new Node(2);
        b.root.right.left = new Node(9);
        b.root.right.right = new Node(7);

        System.out.println("Preorder traversal of binary tree is ");
        b.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        b.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        b.printPostorder();


    }

}


