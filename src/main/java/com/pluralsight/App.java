package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double regular = 5.45;
        double large = 8.95;
        double grandTotal = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the size of the sandwich (1 for regular and 2 for large: ");
        int size = keyboard.nextInt();

        System.out.print("Enter your age for discount: ");
        int age = keyboard.nextInt();


        if(size == 1)
            grandTotal = regular;
        else if (size == 2)
            grandTotal = large;
        else
            System.out.println("wrong option, Start Over");

        if (age <= 17);
            grandTotal





    }
}
