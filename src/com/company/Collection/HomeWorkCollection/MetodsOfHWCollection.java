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

    boolean characterList() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уровнение: ");
        String string = scanner.nextLine();

        LinkedList<Character> characterList = new LinkedList<>();
        System.out.println(string);
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
               characterList.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (characterList.isEmpty())
                    return false;

                char last = characterList.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    characterList.pop();
                else
                    return false;
            }

        }

        return characterList.isEmpty();
    }
//        for (char c : string.toCharArray()) {
//            characterList.add(c);
//        }
//            if (Collections.frequency(characterList, '(') == Collections.frequency(characterList, ')')
//            &&(Collections.frequency(characterList, '[') == Collections.frequency(characterList, ']'))
//            &&(Collections.frequency(characterList, '{') == Collections.frequency(characterList, '}'))) {
//                System.out.println("Ввод уровнения - правильный!");
//            }else
//                System.out.println("Ввод уровнения - неправильный! Ошибка в закрытии скобок.");
//
//        return characterList;
//     }


}


