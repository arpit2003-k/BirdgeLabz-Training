/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint => 
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins 
In the main take user input for the number of games and call methods to display results
*/


import java.util.Scanner;

public class RockPaperScissorsStats {

    // 0 = Rock, 1 = Paper, 2 = Scissors
    public static int getComputerChoice() {
        return (int) (Math.random() * 3);
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "";
        }
    }

    // Method to determine winner
    public static String getWinner(int user, int computer) {
        if (user == computer)
            return "Draw";
        else if ((user == 0 && computer == 2) ||
                 (user == 1 && computer == 0) ||
                 (user == 2 && computer == 1))
            return "User";
        else
            return "Computer";
    }

    // Method to calculate stats => returns 2D string array
    public static String[][] getStats(int userWins, int compWins, int totalGames) {

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = "" + userWins;
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = "" + compWins;
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    // Method to display stats table
    public static void displayStats(String[][] stats) {
        System.out.println("\n----- Final Stats -----");
        System.out.println("Player\t\tWins\tWin %");
        System.out.println("------------------------------");

        for (String[] row : stats) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        System.out.println("\nChoices: 0 = Rock, 1 = Paper, 2 = Scissors\n");

        System.out.println("Game  User Computer  Winner");
        System.out.println();

        for (int i = 1; i <= games; i++) {

            System.out.print("Enter your choice for Game " + i + ": ");
            int userChoice = sc.nextInt();

            int compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            System.out.println(i + "\t" + getChoiceName(userChoice) + "\t" +
                    getChoiceName(compChoice) + "\t\t" + winner);
        }

        String[][] stats = getStats(userWins, compWins, games);
        displayStats(stats);

        sc.close();
    }
}
