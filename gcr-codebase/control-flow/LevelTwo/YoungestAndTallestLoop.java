import java.util.Scanner;

public class YoungestAndTallestLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        //  Take input for heights
        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = sc.nextDouble();

        //  Find youngest friend
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("\nYoungest Friend: Amar");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Youngest Friend: Akbar");
        } else {
            System.out.println("Youngest Friend: Anthony");
        }

        //  Find tallest friend
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Tallest Friend: Amar");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Tallest Friend: Akbar");
        } else {
            System.out.println("Tallest Friend: Anthony");
        }
    }
}
