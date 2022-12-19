import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
        int randomNum = GenerateNum.GenerateRandomNumber();
        int guess;
        Boolean play = true;

        Scanner user = new Scanner(System.in);


        int tries = 0;

        while(play) {
            System.out.println("GUESS (1-100): ");
            guess = user.nextInt();
            tries++;

            if (guess == randomNum) {
                System.out.println("Correct! You won with " + tries + " tries!");

               /* System.out.println("Would you like to play again? (y/n)");
                String endGame = user.nextLine();
                if (endGame == "y") {
                    play = true;
                } else play = false;

                Currently, the above does not work as it does not wait for user input
                and therefore immediately exits the program. I am aiming to allow
                the user to choose to continue or exit the game.
                 */
                break;
            }
            else if (guess < randomNum) {
                System.out.println("HIGHER");
            }
            else {
                System.out.println("LOWER");
            }
        }
    }
}
