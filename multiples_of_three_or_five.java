// Class: multiples_of_three_or_five
// This java class file computes the sum of multiples of 3 or 5 below 1000
// Created by James Hawkins

public class multiples_of_three_or_five {
    // Method to get the sum of multiples of 3 or 5 below 1000
    // Returns an int sum
    public static int getSum() {
        // int baseNumber for the condition in the for loop
        int baseNumber = 1000;

        // Set sum equal to zero to add onto it in the for loop
        int sum = 0;

        // Increments currentNumber by 1 until it gets to the baseNumber 1000
        // currentNumber is an int that represents each digit below 1000
        for (int currentNumber = 0 ; currentNumber < baseNumber; currentNumber++) {
            // Checks to see if the remainder of the number currentNumber is 0 when divided by 3
            if (currentNumber % 3 == 0) {
                // Add number currentNumber onto sum
                sum += currentNumber;
            }

            // Checks to see if the remainder of the number currentNumber is 0 when divided by 5
            else if (currentNumber % 5 == 0) {
                // Add number currentNumber onto sum
                sum += currentNumber;
            }
        }
        // Returns sum of numbers that are multiples of 3 or 5 below 1000
        return sum;
    }

    // main method
    public static void main(String[] args) {
        // Print result of getSum() function
        System.out.println(getSum());
    }

}