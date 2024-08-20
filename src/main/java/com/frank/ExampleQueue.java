package com.frank;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

    public static void main(String[] args) {
        Queue<Integer> tasksStillToBeDone = new LinkedList<>();
        tasksStillToBeDone.offer(3);
        tasksStillToBeDone.offer(2);
        tasksStillToBeDone.offer(5);
        tasksStillToBeDone.offer(1);

/*
        while (!tasksStillToBeDone.isEmpty()) {
            // Ask the front-most employee if they're finished
            if (tasksStillToBeDone.peek().equals(1)) {
                // If yes, I want to remove them entirely from the queue
                tasksStillToBeDone.poll();
            } else {
                // If no, remove them from the queue
                Integer oldValue = tasksStillToBeDone.poll();
                // but add back in with less task to be done
                tasksStillToBeDone.offer(oldValue - 1);
            }
            System.out.println(tasksStillToBeDone);
        }
*/
        while (!tasksStillToBeDone.isEmpty()) {
            // Remove the first person but store the number
            // If that number is greater than 1, put them back in with a smaller number
            int currentNumberTasksOfFrontMostPerson = tasksStillToBeDone.poll();
            if (currentNumberTasksOfFrontMostPerson > 1) {
                tasksStillToBeDone.offer(currentNumberTasksOfFrontMostPerson - 1);
            }
            System.out.println(tasksStillToBeDone);
        }

    }
}

// 3, 2, 5, 1 <- Number of tasks to do still per person
// 2, 5, 1, 2
// 5, 1, 2, 1
// 1, 2, 1, 4
// 2, 1, 4
// 1, 4, 1
// 4, 1
// 1, 3
// 3
// 2
// 1
