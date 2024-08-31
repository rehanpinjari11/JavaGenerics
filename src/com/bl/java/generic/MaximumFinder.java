package com.bl.java.generic;

public class MaximumFinder {

    // Generic method to find the maximum of three comparable objects

    public static <T extends Comparable<T>> T findMaximum(T x, T y, T z)
    {
        T max = x;  // Assume x is the maximum

        if (y.compareTo(max) > 0) {
            max = y;  // y is the new maximum
        }

        if (z.compareTo(max) > 0) {
            max = z;  // z is the new maximum
        }

        return max;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Find Maximum Problem using Generics");

        // Test Case
        Integer maxInt = findMaximum(10, 5, 2);
        float maxFloat = findMaximum(6.5f, 8.4f, 12.3f);
        String maxString = findMaximum("Apple", "Peach", "Banana");

        // Print Result
        System.out.println("Maximum Number is: " + maxInt); // Expected: 10
        System.out.println("Maximum Number is: " + maxFloat); // Expected 12.3
        System.out.println("Maximum String is: " + maxString); // Expected Peach

    }

}
