package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the circle radius: ");
        String userInput = input.nextLine();

        double radius = Double.parseDouble(userInput);

        System.out.println("The area of a circle with radius " + radius +  "is " + calculateCircleArea(radius));

    }

    public static double calculateCircleArea(double userRadius){
        return Math.PI * userRadius * userRadius;
    }
}
