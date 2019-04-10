package com.company.Collection.HomeWorkCollection.HWArrayList100_000_000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        long r = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            integers.add(random.nextInt());

//            for (Integer x : integers) {
//                System.out.println(x);
//            }
        }
        long r1 = System.currentTimeMillis();
        long resultOfAddRandomElements = r1 - r;
        System.out.println("\n" + "AL Time after add random elements - " + resultOfAddRandomElements + "\n" );

        long r2 = System.currentTimeMillis();
        Collections.shuffle(integers);
//        for (Integer x : integers) {
//            System.out.println(x);
//        }

        long r3 = System.currentTimeMillis();
        long resultOfShuffle = r3-r2;
        System.out.println("\n" + "AL Time after shuffle - " + resultOfShuffle + "\n" );

        long r4 = System.currentTimeMillis();
        Collections.sort(integers);
//        for (Integer x : integers) {
//            System.out.println(x);
//        }

        long r5 = System.currentTimeMillis();
        long resultOfSort = r5 - r4;
        System.out.println("\n" + "AL Time after sort - " + resultOfSort + "\n" );
        System.out.println("Size of Array list is - " + integers.size());


//// Linked List

        LinkedList<Integer> integers1 = new LinkedList<>();
        Random random1 = new Random();
        long c = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            integers1.add(random1.nextInt());

//            for (Integer x : integers) {
//                System.out.println(x);
//            }
        }
        long c1 = System.currentTimeMillis();
        long resultOfAddRandomElements1 = c1 - c;
        System.out.println("\n" + "AL Time after add random elements - " + resultOfAddRandomElements1 + "\n" );

        long c2 = System.currentTimeMillis();
        Collections.shuffle(integers1);
//        for (Integer x : integers) {
//            System.out.println(x);
//        }

        long c3 = System.currentTimeMillis();
        long resultOfShuffle1 = c3-c2;
        System.out.println("\n" + "AL Time after shuffle - " + resultOfShuffle1 + "\n" );

        long c4 = System.currentTimeMillis();
        Collections.sort(integers1);
//        for (Integer x : integers) {
//            System.out.println(x);
//        }

        long c5 = System.currentTimeMillis();
        long resultOfSort1 = c5 - c4;
        System.out.println("\n" + "AL Time after sort - " + resultOfSort1 + "\n" );
        System.out.println("Size of Array list is - " + integers1.size());


    }
}
