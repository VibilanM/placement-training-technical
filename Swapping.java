package com.example;

public class Swapping {
    public static void main(String[] args) {
        int x = 22;
        int y = 77;
        System.out.println("Before swapping: ");
        System.out.println("x = " + x + " and y = " + y);
        
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        
        System.out.println("\nAfter swapping: ");
        System.out.println("x = " + x + " and y = " + y);
    }
}