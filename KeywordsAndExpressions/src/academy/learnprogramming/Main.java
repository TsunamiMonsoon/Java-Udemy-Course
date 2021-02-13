package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.608334 kilometers
        double kilometers = (100 * 1.609334);

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        calculateScore(true, 10000, 8, 200);

//        challenge
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Orange Juice", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Eggs", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Waffles", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bacon", highScorePosition);
    }
    // methods
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

//     Challenge
//    Create a method called displayHighScorePosution
//    it should a players name as a parameter, and a 2nd parameter as a position in the high score table
//    you should display the players name along with a message like "managed to get into position" and the
//    position they got and a further message " on with the high score table"
//
//    Create a 2nd method called calculateHighScorePosition
//    it should be sent one argument only the player score
//    it should return an int
//    the return data should be
//    1 if the score is >= 1000
//    2 if the score is >= 500 and <= 1000
//    3 is the score is >= 100 and <= 500
//    4 in all other cases
//     call both methods and display the reuslts of the following
//    a score of 1500, 900, 400, 50

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
            + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1; // set position to 1
        } else if (playerScore >= 500){
            return 2; // set position to 23
        } else if (playerScore >= 100){
            return 3; // set position to 3
        } else {
            return  4; // set position to 4
        }
    }

}
