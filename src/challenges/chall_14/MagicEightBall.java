package challenges.chall_14;

import java.util.Scanner;

public class MagicEightBall {

    /**
     * Show description at start
     */
    private void entranceDesc() {
        System.out.println("Welcome in Magic 8-Ball fortune teller!");
        System.out.println("**Ask any question and see what awaits you**");
        System.out.println("\n");
    }

    /**
     * Ask user to provide question
     */
    private void question() {
        Scanner in = new Scanner(System.in);
        System.out.print("Your question: ");
        in.nextLine();
    }

    /**
     * Make simple animation and show an answer
     *
     * @param answer    The string from other class
     * @throws InterruptedException     Throw Exception
     */
    private void simpleAnimationWithAnswer(String answer) throws InterruptedException {
        System.out.println("\n\n");
        String text = "Shaking...";
        for(int i = 0; i < 3; ++i) {
            Thread.sleep(500);
            System.out.printf("%s ", text);
        }
        System.out.println("\n\t\t\t*" + answer + "*");
    }

    public static void main(String[] args) throws InterruptedException {
        Answers answer = new Answers();
        MagicEightBall mainProgram = new MagicEightBall();

        mainProgram.entranceDesc();
        mainProgram.question();
        mainProgram.simpleAnimationWithAnswer(answer.drawAnswer());
    }
}
