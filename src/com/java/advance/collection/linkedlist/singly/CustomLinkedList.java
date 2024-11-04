package com.java.advance.collection.linkedlist.singly;

public class CustomLinkedList {
    private Node head= null;
    private Node tail= null;

    public void insert(int data){

        Node newNode = new Node(data);
          if(head == null)
          {
              head = newNode;
              tail =newNode;
          }else {
              tail.next = newNode;
              tail = newNode;
          }
    }

   public void addFist(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(tail == null)
        {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
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
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.insert(10);
        customLinkedList.insert(20);
        customLinkedList.insert(30);
        customLinkedList.printList();
    }
}
