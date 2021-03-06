package challenges.chall_14;

import java.util.concurrent.ThreadLocalRandom;

public class Answers {

    /**
     * Array with answers of magic 8 ball
     */
    final private static String [] answers = {
            "It is certain.", "It is decidedly so.", "Without a doubt.",
            "Yes – definitely.", "You may rely on it.", "As I see it, yes.",
            "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.",

            "Reply hazy, try again.", "Ask again later.", "Better not tell you now.",
            "Cannot predict now.", "Concentrate and ask again.",

            "Don’t count on it.", "My reply is no.", "My sources say no.",
            "Outlook not so good.", "Very doubtful."
    };

    /**
     * Draw random answer from array
     *
     * @return random answer
     */
    public String drawAnswer() {
        return answers[ThreadLocalRandom.current().nextInt(0, answers.length)];
    }
}
