package com.company.Collection.HomeWorkCollection;

import java.util.*;

public class MetodsOfHWCollection {

//Zadacha 1
     Set<Character> stringList (){

         Scanner scanner = new Scanner(System.in);
         System.out.print("Введите строку: ");
         String string = scanner.nextLine();

         Set<Character> set = new HashSet<>();
         for (char c : string.toCharArray())
         {
             set.add(c);
         }

         System.out.println("Количество уникальных символов в строке - " + set.size());

    return set;
    }

//Zadacha 2

    List<Character> characterList() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уровнение: ");
        String string = scanner.nextLine();

        List<Character> characterList = new ArrayList<>();
        System.out.println(string);
        for (char c : string.toCharArray()) {
            characterList.add(c);
        }
            if (Collections.frequency(characterList, '(') == Collections.frequency(characterList, ')')
            &&(Collections.frequency(characterList, '[') == Collections.frequency(characterList, ']'))
            &&(Collections.frequency(characterList, '{') == Collections.frequency(characterList, '}'))) {
                System.out.println("Ввод уровнения - правильный!");
            }else
                System.out.println("Ввод уровнения - неправильный! Ошибка в закрытии скобок.");

        return characterList;
     }
}


