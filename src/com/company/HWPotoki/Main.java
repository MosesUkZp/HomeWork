package com.company.HWPotoki;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ListContainer listContainer = new ListContainer();



        MyThread myThread1 = new MyThread();
        myThread1.list(listContainer);
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.list(listContainer);
        myThread2.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    ArrayList<Integer> list (ArrayList<Integer> integerArrayList){
        Random random = new Random();
        for (int i = 0; i < 1000 ; i++) {
            integerArrayList.add(random.nextInt());
        }
        for (Object o : integerArrayList)
            System.out.println("Thread name is: " + Thread.currentThread().getName() + " Elements: " + o);
        System.out.println(integerArrayList.size());
        return integerArrayList;
    }
}