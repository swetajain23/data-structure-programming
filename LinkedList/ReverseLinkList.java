package com.impetus.linkedList;

public class ReverseLinkList {

    static Node head;

    static class Node{
         int data;
         Node next;
         Node(int d){
             data = d;
             next = null;
         }
    }

     Node reverse(Node node){

        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;

    }

    void printList(Node node){
        while(node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }

    public static void main(String [] args){

       ReverseLinkList r = new ReverseLinkList();
       r.head = new Node(85);
       r.head.next = new Node(50);
       r.head.next.next = new Node(75);
       r.head.next.next.next = new Node(25);
       System.out.println("List before reverse: ");
       r.printList(head);
       head  = r.reverse(head);
       System.out.println("List after reverse: ");
       r.printList(head);


    }
}
