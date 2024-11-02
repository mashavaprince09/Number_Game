# Number Guessing Game

## Description
The Number Guessing Game is a console-based Java application that challenges users to guess a randomly generated number between 0 and 100. Users can specify the number of rounds they'd like to play, and for each round, they get feedback on whether their guess is too high, too low, or correct. The game keeps track of the user's score based on correct guesses and allows them to play multiple times.

## Features
- **Random Number Generation**: A random number between 0 and 100 is generated at the start of each round.
- **Score Tracking**: The game keeps track of the user's correct guesses.
- **Multiple Rounds**: Users specify the number of rounds they want to play in each session.
- **Input Validation**: Ensures guesses are between 0 and 100 and rounds input is positive.
- **Replay Option**: At the end of each game, users can choose to play again or quit.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed (Java 8 or higher).

### Running the Game
1. Clone or download the code.
2. Compile the program:
   ```bash
   javac NumberGame.java
   ```
3. Run the program:
   ```bash
   java NumberGame
   ```

## How to Play
1. Run the program.
2. Enter the number of rounds you'd like to play.
3. For each round, enter a guess for the randomly generated number between 0 and 100.
4. The game will respond with:
   - "Your number is too low." if the guess is below the target number.
   - "Your number is too high." if the guess is above the target number.
   - "You have guessed correctly. Congratulations!!!" if the guess is correct.
5. At the end of the game, your score will be displayed.
6. Enter 'Y' to play again or 'N' to quit.

## Example Output
```
Welcome to the Number Game.
A number between 0 - 100 has been randomly generated.
How many rounds do you want to play: 3

This is round 1
Enter the number you guessed: 50
Your number is too low. Please try again.

This is round 2
Enter the number you guessed: 75
Your number is too high. Please try again.

This is round 3
Enter the number you guessed: 62
You have guessed correctly. Congratulations!!!

Thank you for playing the game.
Your score is 1/3
========================================
Enter 'Y' to play again and 'N' to quit.
```

## Notes
- Enter a positive number for the rounds you want to play. The game will prompt you to re-enter if the input is invalid.
- Guesses should be between 0 and 100. Invalid guesses will prompt a re-entry.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
