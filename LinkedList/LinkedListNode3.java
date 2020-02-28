package com.impetus.linkedList;

public class LinkedListNode3 {

    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void printList(Node node){
        while(node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }

    void findMiddleNode(){
        Node ref = head;
        Node temp = head;
        while(temp.next != null) {
            int i = 0;
            int j = 0;
            while (i != 2) {
                temp = temp.next;
                i++;
            }
            while (j != 1) {
                ref = ref.next;
                j++;
            }
        }
        System.out.println("middle element is: " +ref.data);
        }

    public static void main(String [] args){
        LinkedListNode3 l = new LinkedListNode3();
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
        l.findMiddleNode();
    }
}
