package com.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastOccurrence {

    // Finds first occurrence of x
    static int findFirst(int[] arr, int x) {
        int l = 0, r = arr.length - 1, res = -1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (arr[m] == x) {
                res = m;
                r = m - 1; // search left
            } else if (arr[m] < x) {
                r = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }

    // Finds last occurrence of x
    static int findLast(int[] arr, int x) {
        int l = 0, r = arr.length - 1, res = -1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (arr[m] == x) {
                res = m;
                l = m + 1; // search right
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("------------------------------------------------------");

        // Read sorted array
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("------------------------------------------------------");

        // Read target element
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        
        Arrays.sort(arr);
        System.out.println("------------------------------------------------------");

        int first = findFirst(arr, x);
        int last = findLast(arr, x);
        System.out.println("------------------------------------------------------");

        // Display result
        if (first == -1)
            System.out.println("Element not found");
        else {
            System.out.println("First occurrence index: " + first);
            System.out.println("Last occurrence index: " + last);
            
        }
        System.out.println("------------------------------------------------------");

        sc.close();
    }
}