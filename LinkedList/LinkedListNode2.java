package com.impetus.linkedList;

//optimized method to find nth node from end of linkedlist
/*Maintain two pointers – reference pointer and main pointer.Initialize both reference and main pointers to head.
First, move reference pointer to n nodes from head. Now move both pointers one by one until the reference pointer reaches the end.
Now the main pointer will point to nth node from the end. Return the main pointer.*/

public class LinkedListNode2 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    void findNode(int index){
        Node ref = head;
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        System.out.println("nth node from front: " +temp.data);
        while(temp.next != null){
            ref = ref.next;
            temp = temp.next;
        }
        System.out.println("nth node is: " +ref.data);
    }

    void printList(Node node){
        while(node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }

    public static void main(String [] args){
        LinkedListNode2 l = new LinkedListNode2();
        l.head = new Node(85);
        l.head.next = new Node(50);
        l.head.next.next = new Node(75);
        l.head.next.next.next = new Node(25);
        l.head.next.next.next.next = new Node(65);
        l.head.next.next.next.next.next = new Node(95);
        l.head.next.next.next.next.next.next = new Node(35);
        System.out.println("List: ");
        l.printList(head);
        System.out.println(" ");
        l.findNode(5);
    }
}
