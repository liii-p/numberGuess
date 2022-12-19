# Welcome to number guess!

This is a simple java game where you have to guess what the number is. More creative name coming soon.

## Process
To build this game, I wanted to try to incorporate OOP so that my code is more clean and logical.

I separated the number generation method into its own class GenerateNum. This then made the main class less cluttered.

I also attempted to create a continueGame method which would ask the user whether they wished to continue playing, but I was unsuccessful due to the method needing to rely on variables from the main class. Not only that, but the method did not act as expected. More on that below.

-- UPDATE
I created a continue game function by adding a boolean gameOver. You can view it in the code. When the user correctly guesses, gameover is set to true and then another if-else statement runs to ask if they would like to continue playing.

## Areas to Improve

When the user is asked whether or not to continue, it does not wait for user input despite .nextLine() being invoked. I need to investigate alternatives to this.

-- UPDATE
I used .next instead of .nextLine()

The gameOver function could be improved further as it currently has to reassign variables in order to work. Or this might be as good as it gets, who knows. I will be attempting to improve it in the future.



