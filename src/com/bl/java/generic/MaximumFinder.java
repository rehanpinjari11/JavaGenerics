package com.bl.java.generic;

public class MaximumFinder {

    // Method to find the maximum of three integers
    public static Integer findMaximum(Integer x, Integer y, Integer z)
    {
        Integer max = x; // Assume x is a Maximum

        if(y.compareTo(max) > 0)
        {
            max = y; // y is the Maximum
        }
        if(z.compareTo(max) > 0)
        {
            max = z; // z is the Maximum
        }

        return max; // return the maximum number found

    }

    public static float findMaximum(Float x, Float y, Float z)
    {
        float max = x;

        if(y.compareTo(max) > 0)
        {
            max = y;
        }
        if(z.compareTo(max) > 0)
        {
            max = z;
        }

        return max;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Find Maximum Problem using Generics");

        // Test Case
        Integer maxInt = findMaximum(10, 5, 2);
        float maxFloat = findMaximum(6.5f, 8.4f, 12.3f);

        // Print Result
        System.out.println("Maximum Number is: " + maxInt); // Expected: 10
        System.out.println("Maximum Number is: " + maxFloat); // Expected 12.3

    }

}
