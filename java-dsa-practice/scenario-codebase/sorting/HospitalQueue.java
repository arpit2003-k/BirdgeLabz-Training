package sorting;

import java.util.*;

public class HospitalQueue {
    public static void bubbleSort(int [] criticality) {
        int n = criticality.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if next patient is more critical
                if (criticality[j] < criticality[j + 1]) {
                    int temp = criticality[j];
                    criticality[j] = criticality[j + 1];
                    criticality[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the Number of the Patients admitted in the Hospital ");
        int patient=kb.nextInt();
        int []criticality=new int[patient];
        System.out.println("Welcome to the Hospital Queue Management Application");
        System.out.println("------------------------------------------------------------------");
        for (int i=0;i< criticality.length;i++){
            System.out.println("Enter the Criticality level of the Patients number : "+(i+1));
            criticality[i]=kb.nextInt();
            System.out.println("------------------------------------------------------------------");
        }
        System.out.println("Patients in the Hospitial with the criticality level when Not sorted: ");
        for (int x:criticality) {
            System.out.print(x+" ");
        }
        System.out.println("\n------------------------------------------------------------------");
        bubbleSort(criticality);
        System.out.println("Patients in the Hospitial with the criticality level when sorted and Arranged : ");
        for (int x:criticality) {
            System.out.print(x+" ");
        }
        System.out.println("\n------------------------------------------------------------------");
    }
}