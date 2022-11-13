package com.example.myapp2;

import java.util.Scanner;

public class HomeWork {
    public static void main (String [] args) {
        task1 ();

    }

    static void task1 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

}
