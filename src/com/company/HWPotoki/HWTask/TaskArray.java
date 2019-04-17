package com.company.HWPotoki.HWTask;


import java.util.Random;

public class TaskArray implements Runnable {

    Random random = new Random();

    int[][] array = new int[random.nextInt(10)][random.nextInt(10)];

    private int s = 0;
    private int Str1 = 0;

    public int[][] getArray() {
        return array;
    }

    @Override
    public void run() {
        while (s < array.length) {
            for (int r = 0; r < array.length; r++) {
                Str1 += array[s][r];
            }
            s++;
            System.out.println("Sum of elements row " + s + " = " + Str1);
            Str1 = 0;
        }
    }

}

//    дан двумерный массив целых чисел размерностью NxM.
//    посчитать сумму всех элементов. сумма каждой строки считается в отдельном потоке

