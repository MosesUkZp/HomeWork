package com.company.Collection.HomeWorkCollection.HWCollectionUsers;

import java.util.Objects;

public class Users  {

    private Long Id;
    private String Name;

    Users(Long id, String name) {
        Id = id;
        Name = name;
    }
    @Override
    public String toString() {
        return "Users " +
                "Id = " + Id +
                ", Name = " + Name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(Id, users.Id) &&
                Objects.equals(Name, users.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name);
    }
}






