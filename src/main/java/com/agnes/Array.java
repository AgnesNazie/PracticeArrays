package com.agnes;

public class Array {
    public static void main(String[] args) {
        String[] myArray = new String[6];
        myArray[0] = "Agi";
        myArray[1] = "nes";
        myArray[2] = "naz";
        myArray[3] = "mbo";
        myArray[4] = "che";
        myArray[5] = "zie";
        for (int i = 0; i < 6; i++)
            System.out.println(myArray[i]);
        System.out.println("=============================");

        int[] myArrays = new int[5];
        myArrays[0] = 10;
        myArrays[1] = 20;
        myArrays[2] = 30;
        myArrays[3] = 40;
        myArrays[4] = 50;

        for (int i = 0; i < 5; i++)
            System.out.println(myArrays[i]);
        System.out.println("=============================");

        int[] numbers = {70, 90, 50, 110, 400, 300, 900};
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            // calculate the max number
            if (number > max) {
                max = number;
            }
            //calculate the min number
            if (number < min) {
                min = number;
            }
            // calculate average
            int sum = 0;
            sum += number;
            double average = (double) sum / numbers.length;

            // to check if a particular  exist in the array
            int[] number0 = {70, 90, 50, 110, 400, 300, 900};
            int target = 400;
            boolean found = false;
            for (int number1 : number0) {
                if ( number1 == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println( target + " is in the array");
            } else{
                System.out.println(target + " is not in the array");
            }

            System.out.println(max);
            System.out.println(min);
            System.out.println(average);
            // reverse  and print array
            System.out.println("Arrays in reverse order: ");
            for (int i = numbers.length - 1; i >= 0; i--)
                System.out.println(numbers[i]);
        }

    }
}
