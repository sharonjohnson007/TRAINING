package main.java;

import java.util.Random;

/**
 * Throw 3 dices and get the total score. Also examine for
 * - 3-of-a-kind (all 3 dice are the same);
 * - pair (any two dice are the same);
 * - special (one dice is more than the sum of the other two)
 */

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int[] diceScores = new int[3];
        int totalScore = 0;

        for (int i = 0; i < diceScores.length; ++i) {
            diceScores[i] = random.nextInt(6) + 1;
        }

        System.out.print("The dice are:");
        for (int diceScore : diceScores) {
            totalScore += diceScore;
            System.out.print(" " + diceScore);
        }
        System.out.println();
        System.out.println("The total score is " + totalScore);

        if (diceScores[0] == diceScores[1]) {
            if (diceScores[0] == diceScores[2]) {
                System.out.println("It's a 3-of-a-kind");
            } else {
                System.out.println("It's a pair");
            }
        } else {
            if (diceScores[0] == diceScores[2] || diceScores[1] == diceScores[2]) {
                System.out.println("It's a pair");
            }
        }
        if ((diceScores[0] > diceScores[1] + diceScores[2]) ||
                (diceScores[1] > diceScores[0] + diceScores[2]) ||
                (diceScores[2] > diceScores[0] + diceScores[1])) {
            System.out.println("It's a special");
        }
    }
}
