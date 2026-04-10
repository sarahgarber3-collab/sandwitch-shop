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

        System.out.print("Would you like the sandwich loaded (1 for yes 2 for no): ");
        int answer = keyboard.nextInt();

        System.out.print("Enter your age for discount: ");
        int age = keyboard.nextInt();


        if(size == 1) {
            grandTotal = regular;
        } else if(size == 2) {
            grandTotal = large;
        } else {
            System.out.println("Wrong option, Start over");
        }

        if(answer == 1) {
            grandTotal = regular + 1.00;
        }
        else if(answer == 2) {
            grandTotal = large + 1.75;
        }

        if(age <= 17) {
            grandTotal *= .9;
        }
        else if(age >= 65) {
            grandTotal *= .8;
        }

        System.out.println("your order total: $" + grandTotal);
        }







    }

