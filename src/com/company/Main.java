package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to main");
        System.out.println("Please enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();
        System.out.println("And the sum of given numbers is" + i + i1);
    }
}
