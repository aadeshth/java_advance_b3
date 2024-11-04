package com.java.advance.collection.hashmap.customhashmap;

import java.util.Objects;

public class CustomHashMap<K, V> {

    //initial capacity  = 16
    //load factor = 0.75
    //class node
    //size
    //hash method return int index based on the key
    //put (key, value)
    //get(key)
    //printAll()
    //resize()
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private class Node<K, V>{
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
    }
    private  Node<K, V> [] buckets;
    private int size;

    public CustomHashMap(){
        buckets = new Node[INITIAL_CAPACITY];
        size= 0;
    }

    private int getIndex(K key)
    {
       return Math.abs(Objects.hashCode(key) % (buckets.length-1));
    }

    public void put(K key, V value)
    {
        int index = getIndex(key);
        Node<K, V> newNode = new Node<>(key, value);
        if(buckets[index]==null)
            buckets[index]=newNode;
        else {
           Node<K,V> temp = buckets[index];
           while(temp!=null)
           {
               if(temp.key.equals(key))
               {
                   temp.value = value;
                   return;
               }
               if(temp.next == null) break;
               temp = temp.next;
           }
           temp.next = newNode;
           size++;
        }
        //resize
        // check load factor
        // resize method
    }
    // resize: old copy to new bucket and new bucket size [old bucket length * 2]
 /// copy all nodes from old node to new node

    public V get(K key)
    {
        int index = getIndex(key);
        Node<K,V> temp = buckets[index];
        while(temp!=null)
        {
            if(temp.key.equals(key))
            {
                return temp.value;
            }
            temp = temp.next;
        }
        return  null;
    }



}
