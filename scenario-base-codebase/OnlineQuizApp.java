/*17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.*/

import java.util.*;

public class OnlineQuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String[] questions = {
            "1. Which language is used for Android Development?\nA. Java\nB. Python\nC. Swift\nD. C",
            "2. Which one is a search engine?\nA. Google\nB. Facebook\nC. Instagram\nD. WhatsApp",
            "3. Which keyword is used to create a class in Java?\nA. object\nB. class\nC. create\nD. struct",
            "4. Which company developed Java?\nA. Microsoft\nB. Sun Microsystems\nC. Apple\nD. IBM",
            "5. Which symbol is used for single-line comments in Java?\nA. <!-- -->\nB. **\nC. //\nD. ##"
        };

        
        char[] answers = {'A','A','B','B','C'};

        int score = 0;

        System.out.println("Welcome to the Online Quiz!");
        System.out.println("--------------------------------");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");

            char userAns = Character.toUpperCase(sc.next().charAt(0));

            switch(userAns) {

                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if(userAns == answers[i]) {
                        System.out.println(" Correct!");
                        score++;
                    } else {
                        System.out.println(" Wrong! Correct answer is: " + answers[i]);
                    }
                    break;

                default:
                    System.out.println("Invalid option! Question skipped.");
            }
        }

        System.out.println("\n--------------------------------");
        System.out.println("Your Final Score = " + score + " out of 5");
        System.out.println("Thank you for participating! ");

        sc.close();
    }
}