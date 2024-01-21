package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public static List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();

        if (numberOfDishes<=0) {
        } else {
            Queue<Integer> queue = new ArrayDeque<>();

            for (int i=1; i<=numberOfDishes; i++) {
                queue.add(i);
            }
            System.out.println("Initial queue is: " + queue);
            System.out.println();

            int counter = 1;

            while (!queue.isEmpty()) {
                System.out.println("counter is: " + counter);

                if (counter==everyDishNumberToEat) {
                    if (!queue.isEmpty()) {
                        list.add(queue.poll());
                    }
                    counter = 0;
                } else {
                    if (!queue.isEmpty()) {
                        queue.add(queue.poll());
                    }
                }

                counter++;

                System.out.println("queue is: " + queue);
                System.out.println("list is: " + list);
                System.out.println();
            }
        }

        return list;
    }
    public static void main(String[] args) {
        System.out.println(determineDishOrder(4, 3));
    }
}
