package com.company.Collection.HomeWorkCollection.HWCollectionUsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class UsersMain {

    public static void main(String[] args) throws IdException {

        List<Users> usersList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Users users = new Users(random.nextLong(), "Miroslav");
            if (usersList.contains(users)) {
                throw new IdException();
            } else {
                usersList.add(users);
        }
        }

        usersList.sort(new UsersComparator());
        usersList.forEach(System.out::println);

    }
}
