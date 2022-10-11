import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random randNumber = new Random();

        int sum, point;
        boolean play = true;
        String answer;

        while (play) {
            sum = randNumber.nextInt(12) + 1;
            point = sum;

            if (sum == 7 || sum == 11) {
                System.out.println("Sum of first roll = " + sum);
                System.out.println("Player wins!");
            }
            else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Sum of first roll = " + sum);
                System.out.println("Player loses!");
            }
            else {
                if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
                    System.out.println("Sum of first roll = " + sum);
                    System.out.println(sum + " is the point");
                }
                else if (sum == 7) {
                    System.out.println("Sum of next roll = " + sum);
                    System.out.println("Player loses!");
                }
                else if (sum == point) {
                    System.out.println("Sum of next roll equal the point: " + point);
                    System.out.println("Player wins!");
                }
                else {
                    System.out.println("Sum of next roll = " + sum);
                }
            }
            System.out.println("Do you want to play again? y/n");
            answer = scan.nextLine();
            if (answer.charAt(0) == 'y')  {
                play = true;
            }
            else {
                System.out.println("Thanks for playing!");
                play = false;
            }
        }
    }


}
