package Chapter7;

import java.security.SecureRandom;

public class Task718 {

    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST}

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    static int[] wins; // number of wins, by rolls
    static int[] losses; // number of losses, by rolls
    static int winSum = 0; // total number of wins
    static int loseSum = 0; // total number of losses


    public static void main(String[] args) {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
        int roll; // number of rolls for the current game
        wins = new int[22]; // frequency of wins
        losses = new int[22]; // frequency of losses
        for (int i = 0; i < 1000000; i++) {

            int sumOfDice = rollDice(); // first roll of the dice
            roll = 1;
            // determine game status and point based on first roll
            switch (sumOfDice) {
                case SEVEN: // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gameStatus = Status.LOST;
                    break;
                default: // did not win or lose, so remember point
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // remember the point
                    break;
            }

            // while game is not complete
            while (gameStatus == Status.CONTINUE) // not WON or LOST
            {
                sumOfDice = rollDice(); // roll dice again
                roll++;
                // determine game status
                if (sumOfDice == myPoint) // win by making point
                    gameStatus = Status.WON;
                else if (sumOfDice == SEVEN) // lose by rolling 7 before point
                    gameStatus = Status.LOST;
            }
            // all roll results after 20th roll input in last element
            if (roll >= 20) {
                roll = 21;
            }
            // increase number of wins and losses in that roll
            if (gameStatus == Status.WON) {
                ++wins[roll];
                ++winSum;
            } else {
                ++losses[roll];
                ++loseSum;
            }
        }
        int totalGames = winSum + loseSum; // total number of games
        int length = 0; // total length of the games
        // display number of wins and losses on all rolls
        for (int i = 1; i <= 21; i++) {
            if (i == 21) {
                System.out.println(wins[i] + " games won and " + losses[i] + " games lost on rolls after the 20th roll");
            } else {
                System.out.println(wins[i] + " games won and " + losses[i] + " games lost  on roll №" + i);
            }
            // for calculating length of game number of wins/losses on that roll multiplied
            // by the roll number, then add them to length
            length += wins[i] * i + losses[i] * i;
        }

        System.out.println("The chances of winning are " + (100.0 * winSum / totalGames) + "%");
        System.out.println("The average game length is " + ((double) length / totalGames) + " rolls.");

    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2; // sum of die values

        return sum;
    }
}
