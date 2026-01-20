import java.util.Scanner;

public class SmartSelf {

    static void insertionSort(String [] books, int count) {

        for (int i = 1; i < count; i++) {
             String key = books[i];
            int j = i - 1;

            // Shift books greater than key to the right
            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        String []books = new String[n];
        int count = 0;

        // Real-time book insertion
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter book title: ");
            books[i] = sc.nextLine();
            count++;

            insertionSort(books, count);

            // Display current sorted shelf
            System.out.println("📖 Current Sorted Reading List:");
            for (int j = 0; j < count; j++) {
                System.out.println(" - " + books[j]);
            }
        }

        sc.close();
    }

}
