package com.impetus.linkedList;

//find nth node from end of Linked List
public class LinkedListNode {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static void findNode(int index){
        //find the length of LinkedList
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("length of LinkedList "+count);
        int n = count - index + 1;
        temp = head;
        for(int i = 1 ; i<n ; i++){
            temp = temp.next;
        }
        System.out.println("nth node from last is: "+temp.data);

    }
    void printList(Node node){
        while(node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        LinkedListNode l = new LinkedListNode();
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
        l.findNode(4);
    }
}
