package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib bitte eine Zahl: ");
        int a = scan.nextInt();
        System.out.println("Gib bitte noch eine Zahl: ");
        int b = scan.nextInt();

        if(a < b) {
            System.out.println("Die kleinste Zahl ist: " + a);
        } else {
            System.out.println("Die kleinste Zahl ist: " + b);
        }
    }
}
