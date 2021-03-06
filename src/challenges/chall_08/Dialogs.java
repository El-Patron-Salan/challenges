package challenges.chall_08;

public class Dialogs {

    public Dialogs(){}

    public static void descriptionOfGame(){

        System.out.println("\t\t\tHello in HANGMAN game! :D");
        System.out.println("\t\tThere are two game options:" +
                "\n1. Computer picks a random word and you've to guess it" +
                "\n2. You or your friends input word and the other person tries to guess it - COMING SOON!");
        System.out.println("\tThe rules are quite simple:" +
                "\n~ you've 7 lives(number of tries)" +
                "\n~ you can provide only one character or whole word" +
                "\n~ but be aware of the fact that if you type wrong word u lose immediately!" +
                "\n~ you're guessing only one word - it doesn't have any space between" +
                "\n~ when little man is doomed YOU LOSE" +
                "\n~ when little man escapes YOU WIN" +
                "\n\t\t That's all - Have Fun and enjoy the game;))");
    }

    public static void outputAfterTheGame(boolean winOrNot, String correctWord, int numbOfLives){
        if(winOrNot) {
            System.out.println("\tCongratulations, you've guessed the correct word \"" + correctWord + "\" and WON the game!");
            System.out.println("\t\t\tThe number of lives left: " + numbOfLives);
        }
        else {
            System.out.println("\t\t\tYou've run out of lives - you LOSE");
            System.out.println("\t\t\tThe hidden word was \"" + correctWord + "\"");
        }
    }
}
