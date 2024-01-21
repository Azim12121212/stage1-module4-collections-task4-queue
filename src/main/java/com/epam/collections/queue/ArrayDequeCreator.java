package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public static ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrDeq = new ArrayDeque<>();

        System.out.println("Initial q1 and q2:");
        System.out.println(firstQueue);
        System.out.println(secondQueue);
        System.out.println();

        System.out.println("BEGINNING OF THE GAME");
        // First, both take turns adding two cards to the ArrayDeque<Integer>
        arrDeq.add(firstQueue.poll());
        arrDeq.add(firstQueue.poll());
        arrDeq.add(secondQueue.poll());
        arrDeq.add(secondQueue.poll());
        System.out.println("arrDeq (+4 cards): " + arrDeq);
        System.out.println("q1 (-2 card): " + firstQueue);
        System.out.println("q2 (-2 card): " + secondQueue);

        int c = 1;
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            System.out.println("LOOP " + c);

            // Then, with each move, the player
            if (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
                // takes the top card from the ArrayDeque<Integer>
                // and adds this card to the end of his Queue<Integer>
                firstQueue.add(arrDeq.pollLast());
                System.out.println("q1 (+1 card): " + firstQueue);
                System.out.println("arrDeq (-1 cards): " + arrDeq);

                // then puts two cards from the beginning of his Queue<Integer>
                // into the ArrayDeque<Integer>
                arrDeq.add(firstQueue.poll());
                arrDeq.add(firstQueue.poll());
                System.out.println("arrDeq (+2 cards): " + arrDeq);
                System.out.println("q1 (-2 cards): " + firstQueue);

                System.out.println();

                secondQueue.add(arrDeq.pollLast());
                System.out.println("q2 (+1 card): " + secondQueue);
                System.out.println("arrDeq (-1 cards): " + arrDeq);

                arrDeq.add(secondQueue.poll());
                arrDeq.add(secondQueue.poll());
                System.out.println("arrDeq (+2 cards): " + arrDeq);
                System.out.println("q2 (-2 cards): " + secondQueue);
            }
            System.out.println();
            c++;
        }
        System.out.println("END OF THE GAME");

        return arrDeq;
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

//        q1.add(1);
//        q1.add(4);
//        q2.add(5);
//        q2.add(6);

        q1.add(1);
        q1.add(5);
        q1.add(7);
        q1.add(6);
        q2.add(2);
        q2.add(5);
        q2.add(8);
        q2.add(3);

//        q1.add(1);
//        q1.add(3);
//        q1.add(5);
//        q1.add(4);
//        q1.add(7);
//        q1.add(9);
//        q2.add(4);
//        q2.add(2);
//        q2.add(8);
//        q2.add(5);
//        q2.add(8);
//        q2.add(3);

        System.out.println(createArrayDeque(q1, q2));
    }
}
