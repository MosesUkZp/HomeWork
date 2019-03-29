package com.company.Collection;

import java.util.*;

public class MainCollection {

    public static void main(String[] args) {

//ArrayList

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Alex");
        arrayList.add("James");
        arrayList.add("Ronald");
        arrayList.add("Kassi");

        Iterator<String> iteratorArrayList = arrayList.iterator();

        while (iteratorArrayList.hasNext()){
            System.out.println(iteratorArrayList.next());
        }

//LinkedList

        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.addAll(arrayList);
        linkedlist.add("Maksim");

        Iterator<String> iteratorLinkedList = linkedlist.iterator();

        System.out.println("\n");

        while (iteratorLinkedList.hasNext()){
            System.out.println(iteratorLinkedList.next());
        }

//HashSet

        HashSet<String> hashSet = new HashSet<>();

        hashSet.addAll(linkedlist);
        hashSet.add("Artur");

        Iterator<String> iteratorHashSet = hashSet.iterator();

        System.out.println("\n");

        while (iteratorHashSet.hasNext()){
            System.out.println(iteratorHashSet.next());
        }
        System.out.println("\n");

// ArrayList2

        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("Sam");
        arrayList2.add("Jon");
        arrayList2.add("Alex");
        arrayList2.add("Kassi");

//Collection metod two ArrayList in one

        CollectionMetods collectionMetods = new CollectionMetods();
        collectionMetods.summArrayList(arrayList, arrayList2);




    }
}

