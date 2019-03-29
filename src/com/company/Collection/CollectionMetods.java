package com.company.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionMetods {

    public ArrayList<String> summArrayList(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {

        ArrayList<String> arrayList3 = new ArrayList<>();
//        arrayList3.addAll(arrayList1);
//        arrayList3.addAll(arrayList2);

        for (int i = 0; i < arrayList1.size(); i++) {
            for (int j = 0; j < arrayList2.size(); j++) {
                if (arrayList1.get(i).equals(arrayList2.get(j))){
                    arrayList3.add(arrayList1.get(i));
                }
            }
        }
        Iterator<String> iterator = arrayList3.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return arrayList3;
    }



}
