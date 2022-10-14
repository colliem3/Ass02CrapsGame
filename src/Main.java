import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        String playAgain = "";
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int diceSum = die1 + die2;
        boolean done = true;
        boolean valid = true;


        do {
            while (true) {
                System.out.println("You rolled " + diceSum + " for this turn");
                if (diceSum == 7 || diceSum == 11) {
                    System.out.println("You got a natural.");
                    break;
                } else if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
                    System.out.println("You crapped out.");
                    break;
                } else {
                    System.out.println(diceSum + " is the point now. Roll again. ");

                }


                while (true) {
                    int die3 = rnd.nextInt(6) + 1;
                    int die4 = rnd.nextInt(6) + 1;
                    int diceSum2 = die3 + die4;

                    System.out.println("You rolled " + diceSum2);

                    if (diceSum2 == diceSum) {
                        System.out.println("You won!");
                        break;
                    } else if (diceSum2 == 7) {
                        System.out.println("You lost!");
                        break;
                    } else {
                        System.out.println("You got " + diceSum2 + " go again");

                    }
                }
                break;
            }
            System.out.println("Do you want to play again? [Y/N]");
            do {
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y")) {
                    done = false;
                    valid = true;
                } else if (playAgain.equalsIgnoreCase("N")) {
                    done = true;
                    valid = true;
                    System.out.println("Thanks for playing!");
                } else {
                    System.out.println("Enter a valid response please: [Y/N]");
                    valid = false;
                }
            }while (!valid);
        }while (!done);
    }
}