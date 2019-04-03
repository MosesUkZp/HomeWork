package com.company.Collection.HomeWorkCollection.HWCollectionUsers;

import java.util.Comparator;

public class UsersComparator implements Comparator <Users> {

    @Override
    public int compare(Users o1, Users o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
