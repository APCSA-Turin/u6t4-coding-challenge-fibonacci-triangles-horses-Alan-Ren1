package com.example.project;

public class HorseBarn {
    /** The stalls in the barn. Each array element holds a reference to the Horse
     *  that is currently occupying the stall. A null value indicates an empty stall.
     */
    private Horse[] stalls;

    /** Initializes stalls to an array with a length equal to numStalls
     *  (all elements remain null initially)
     *
     *  @param numStalls  the number of stalls in the barn
     */
    public HorseBarn(int numStalls) {
        this.stalls = new Horse[numStalls]; // Initialize stalls with null values
    }

    /** Assigns stalls to reference sampleStalls
     */
    public HorseBarn(Horse[] sampleStalls) {
        this.stalls = sampleStalls; // Directly use the provided array of horses
    }

    /** Getter/accessor method for stalls
     *
     *  @return  a reference to the stalls array
     */
    public Horse[] getStalls() {
        return this.stalls;
    }

    /** Returns a string that shows which horses are in which stalls
     */
    public String horseBarnInfo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] == null) {
                sb.append("Stall ").append(i).append(": empty\n");
            } else {
                sb.append("Stall ").append(i).append(": ").append(stalls[i].horseInfo()).append("\n");
            }
        }
        return sb.toString();
    }

    /** Places a Horse into stalls at the index indicated by stall
     *
     *  PRECONDITION: stall is a valid index of stalls
     *
     *  @param horse  the Horse object to place into stalls
     *  @param stall  the index of stalls to place the Horse
     */
    public void placeHorse(Horse horse, int stall) {
        if (stall >= 0 && stall < stalls.length) {
            stalls[stall] = horse; // Place the horse in the specified stall
        }
    }

    /** Returns the index of the stall that contains the horse with the specified name.
     *
     * Precondition: No two horses in the barn have the same name.
     *
     * @param  name the name of the horse to find
     * @return  the index of the stall containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseStall(String name) {
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null && stalls[i].getName().equals(name)) {
                return i; // Return the index if the horse with the given name is found
            }
        }
        return -1; // Return -1 if no horse is found with the given name
    }

    /** Consolidates the barn by moving horses so that the horses are in adjacent
     *  stalls, starting at index 0, with no empty stall between any two horses.
     *
     *  POSTCONDITION: The order of the horses is the same as before the consolidation.
     */
    public void consolidate() {
        Horse[] newStalls = new Horse[stalls.length];
        int index = 0;

        // Move horses into newStalls with no empty stalls between them
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null) {
                newStalls[index++] = stalls[i]; // Add non-null horses to the new array
            }
        }

        this.stalls = newStalls; // Update the original stalls with the consolidated arrangement
    }
}
