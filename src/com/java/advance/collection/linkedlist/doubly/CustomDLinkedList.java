package com.java.advance.collection.linkedlist.doubly;


import com.java.advance.collection.linkedlist.singly.CustomLinkedList;

public class CustomDLinkedList {
    private Node tail= null;
    private  Node head = null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
         head = tail= newNode;
         head.prev = null;
         tail.next = null;
        }else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
    }

    }
    public void printList()
    {
        Node temp = head;
        if(head == null)
            System.out.println("List is empty");
        while (temp !=null)
        {
            System.out.println(temp.data +" ");
            temp= temp.next;
        }
    }

    public static void main(String[] args) {
        CustomDLinkedList customLinkedList = new CustomDLinkedList();
        customLinkedList.addNode(10);
        customLinkedList.addNode(20);
        customLinkedList.addNode(20);
        customLinkedList.printList();
    }
}
