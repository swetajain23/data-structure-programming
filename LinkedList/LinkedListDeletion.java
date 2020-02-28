package com.impetus.linkedList;

public class LinkedListDeletion {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    Node deletionfromfront(Node node){
        Node temp = null;
        temp = node;
        node = node.next;
        return node;

    }

    Node deletionfromend(Node node){
        Node temp = null;
        Node prev = null;
        temp = node;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return node;

    }

    void deletionfrommiddle(int key){
        Node temp = null;
        Node prev = null;
        temp = head;
        for(int i = 1; i<4 ; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }

    void printList(Node node){
        while(node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }



    public static void main(String [] args){
        LinkedListDeletion l = new LinkedListDeletion();
        l.head = new Node(85);
        l.head.next = new Node(50);
        l.head.next.next = new Node(75);
        l.head.next.next.next = new Node(25);
        l.head.next.next.next.next = new Node(65);
        l.head.next.next.next.next.next = new Node(95);
        l.head.next.next.next.next.next.next = new Node(35);
        System.out.println("List before deletion of first node: ");
        l.printList(head);
        head = l.deletionfromfront(head);
        System.out.println("");
        System.out.println("List after deletion of first node: ");
        l.printList(head);
        head = l.deletionfromend(head);
        System.out.println("");
        System.out.println("List after deletion of last node: ");
        l.printList(head);
        l.deletionfrommiddle(4);
        System.out.println("");
        System.out.println("List after deletion of nth node: ");
        l.printList(head);

    }
}
