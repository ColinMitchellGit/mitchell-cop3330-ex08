/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = parseInt(input.nextLine());

        System.out.print("How many pizzas do you have? ");
        int pizzas = parseInt(input.nextLine());

        System.out.print("How many slices per pizza? ");
        int slices = parseInt(input.nextLine());

        int total_slices = pizzas * slices;
        int slices_per_person = total_slices / people;
        int leftover_slices = total_slices % people;

        System.out.println(people + " people with " + pizzas + " pizzas (" + total_slices + " slices)");
        System.out.println("Each person gets " + slices_per_person + " pieces of pizza.");
        System.out.println("There are " + leftover_slices + " leftover pieces.");
    }
}
