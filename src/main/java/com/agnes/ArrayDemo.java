package com.agnes;

public class ArrayDemo {
    public static void main (String [] args) {
        String [] [] names = { {"John", "Jane"}, {"Alex", "Emma"}};
        for (int i = 0; i < names.length; ++i) {
            for (int j = 0; j < names[i].length; ++j) {
                System.out.print(names [i][j] + " ");
            }
            System.out.println();
        }
    }
}
