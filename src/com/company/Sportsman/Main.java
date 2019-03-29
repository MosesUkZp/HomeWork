package com.company.Sportsman;

import com.company.User.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Sportsman[]sportsmen = new Sportsman[4];
        for (int i = 0; i < sportsmen.length; i++) {
            int choice = random.nextInt(3)+1;
            switch (choice){
                case 1:
                    sportsmen[i] = new FootballPlayer(User.scannerName(), User.scannerSurname(),User.scannerYearOfBith(),User.addressName());
                    break;
                case 2:
                    sportsmen[i] = new TennisPlayer(User.scannerName(), User.scannerSurname(),User.scannerYearOfBith(),User.addressName());
                    break;
                case 3:
                    sportsmen[i] = new ChessPlayer(User.scannerName(), User.scannerSurname(),User.scannerYearOfBith(),User.addressName());
                    break;
            }
        }

                System.out.println(Arrays.toString(sportsmen));
        System.out.println(Arrays.toString(sportsmen));



    }
    }