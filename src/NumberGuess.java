import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
        int randomNum = GenerateNum.GenerateRandomNumber();
        int guess;
        boolean play = true;
        boolean gameOver = false;

        Scanner user = new Scanner(System.in);


        int tries = 0;

        while(play) {
            //System.out.println("Secret number: " + randomNum); //For debugging.
            System.out.println("GUESS (1-100): ");
            guess = user.nextInt();
            tries++;

            if (guess == randomNum) {
                System.out.println("Correct! You won with " + tries + " tries!");
                gameOver = true;
            }
            else if (guess < randomNum) {
                System.out.println("HIGHER");
            }
            else if (guess > 100) {
                System.out.println("Invalid guess.");
            }
            else {
                System.out.println("LOWER");
            }

            if (gameOver) {
                System.out.println("Would you like to play again? (y/n)");
                String endGame = user.next().toLowerCase();
                if (endGame.equals("y")) {
                    gameOver = false;
                    tries = 0;
                    randomNum = GenerateNum.GenerateRandomNumber();
                } else play = false;
                /* The above method is a bit inefficient as I have to reassign
                variables, but it works. Will improve in the future.
                 */
            }
        }
    }
}
