package com.company.HWPotoki.HWTask;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TaskArrayMain {
    public static void main(String[] args) {

        Random random = new Random();
        int sumArray = 0;


        int[][] array = new int[random.nextInt(10)][random.nextInt(10)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + "\t");
                sumArray += array[i][j];

            }
            System.out.println();
        }
        System.out.println("Sum of all array elements: " + sumArray);


        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        TaskArray taskArray = new TaskArray();


    }
}