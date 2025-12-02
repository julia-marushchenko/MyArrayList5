/**
 *  Java program to add, remove, print to console elements of ArrayList.
 */

package com.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating ArrayList
        List<String> list = new ArrayList<>();

        // Adding elements to a list
        list.add("MacDonalds");
        list.add("Starbucks");
        list.add("Ditsch");

        // Printing elements of the list to console
        System.out.println(list);

        // Removing "Ditsch" from the list
        list.remove("Ditsch");

        // Printing elements of the list to console
        System.out.println(list);

    }
}