package com.company.Collection.HomeWorkCollection.HWCollectionUsers;

public class IdException extends Exception {

    public IdException () {
        System.out.println("ERROR! Пользователь с таким id уже существует!");
    }
}
