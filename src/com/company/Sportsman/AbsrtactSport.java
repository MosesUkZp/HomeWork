package com.company.Sportsman;

import com.company.User.User;

abstract class AbsrtactSport extends User implements Sportsman {


    String name;
    String sport;
    static int count = 1;


    public AbsrtactSport (String name, String surname, int yearOfBith, String address){
        super(name, surname, yearOfBith, address);

        this.name = name;
        sport = this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    @Override
    public String toString() {
        return "\n" + "Имя " + getName()
                + "\n" + "Фамилия: " + getSurname()
                + "\n" + "Дата рождения: " + getYearOfBith()
                + "\n" + "Полных лет: " + calcAge()
                + "\n" + "Адрес проживания: " + getAddress()
                + "\n" + "Вид спорта: " + getSport();
    }
}
