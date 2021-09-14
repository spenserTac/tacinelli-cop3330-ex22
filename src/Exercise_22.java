/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_22{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.print("Enter the first number: ");
        String temp_num1 = scanner.nextLine();
        int num1 = Integer.parseInt(temp_num1);

        nums.add(num1);

        System.out.print("Enter the second number: ");
        String temp_num2 = scanner.nextLine();
        int num2 = Integer.parseInt(temp_num2);

        nums.add(num2);

        System.out.print("Enter the third number: ");
        String temp_num3 = scanner.nextLine();
        int num3 = Integer.parseInt(temp_num3);

        nums.add(num3);

        // Bubble sort
        // Collections.sort(ArrayList) can also be used but that's no fun.

        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    Collections.swap(nums, j, j + 1);
                }
            }
        }

        int largest_num = nums.get(nums.size() - 1);
        System.out.println("The largest number is " + largest_num);
    }
}