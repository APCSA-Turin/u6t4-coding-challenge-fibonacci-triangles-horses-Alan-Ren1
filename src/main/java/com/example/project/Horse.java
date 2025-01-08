package com.example.project;

public class Horse {
    private String name;
    private int weight;

    // Constructor for initializing the Horse object with name and weight
    public Horse(String name, int weight) {
        this.name = name;    // Assign the name to the instance variable
        this.weight = weight; // Assign the weight to the instance variable
    }

    /** @return the horse's name */
    public String getName() {
        return this.name; // Return the horse's name
    }

    /** @return the horse's weight */
    public int getWeight() {
        return this.weight; // Return the horse's weight
    }

    /** @return a printable String of the Horse -> name: Cathy weight: 1500*/
    public String horseInfo() {
        return "name: " + this.name + ", weight: " + this.weight; // Format the info string
    }
}
