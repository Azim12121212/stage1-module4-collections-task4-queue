package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public static PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (String s: firstList) {
            queue.add(s);
        }
        for (String s: secondList) {
            queue.add(s);
        }

        return queue;
    }
    public static void main(String[] args) {
        String[] s1 = {"Java", "PriorityQueue", "class"};
        String[] s2 = {"It", "is", "different", "from", "standard", "queues", "where", "FIFO"};

        List<String> firstList = new ArrayList<>();
        firstList.addAll(List.of(s1));
        List<String> secondList = new ArrayList<>();
        secondList.addAll(List.of(s2));

        System.out.println(createPriorityQueue(firstList, secondList));
    }
}
