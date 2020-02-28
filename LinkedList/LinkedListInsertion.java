package com.impetus.linkedList;

class Node{

    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class LinkedListInsertion {

    Node head;
    public void insertdatafromfront(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertdatafromlast(int new_data) {
        Node new_node = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
    }

    public void insertdata(Node prev_node, int new_data){
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void printList(){
        Node tnode = head;
        while(tnode != null){
            System.out.println("data value!!! " +tnode.data+ " ");
            tnode = tnode.next;
        }
    }
    public static void main(String args[]){
        LinkedListInsertion l = new LinkedListInsertion();
        l.insertdatafromlast(6);
        l.insertdatafromfront(5);
        l.insertdatafromfront(8);
        l.insertdata(l.head.next, 7);
        l.printList();
    }
}
