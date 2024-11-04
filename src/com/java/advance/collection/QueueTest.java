package com.java.advance.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> nameQueue = new LinkedList<>();
        nameQueue.add("Rohan");
        nameQueue.add("Abhi");
        nameQueue.add("Ravi");
        nameQueue.offer("Om");
        System.out.println(nameQueue);
        System.out.println(nameQueue.peek());
        System.out.println(nameQueue);
        System.out.println(nameQueue.poll());
        System.out.println(nameQueue);
        System.out.println("..........");
        Queue<String> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        pQueue.add("Yebra");
        pQueue.add("Rohan");
        pQueue.add("Abhi");
        pQueue.add("Ravi");
        pQueue.offer("Om");
        pQueue.add("Zebra");
        System.out.println(pQueue);
        System.out.println(pQueue.poll());

        ArrayDeque<String> aDq = new ArrayDeque<>();

    }
}
