package View;

import Model.Card;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);


    /**
     * Rerturning
     * @param card
     * @return 1 if the user continues, 2 if resumes
     */
    public int getUserInputToContinueOrResume(Card card){
        System.out.print("press 1 to continue, 2 to resume: ");
        int continueOrResume;
        while (true) {
            if (scanner.hasNextInt()) {
                continueOrResume = scanner.nextInt();

                if (continueOrResume == 1 || continueOrResume == 2) {
                    break; // valid input → exit loop
                } else {
                    System.out.println("Please choose number 1 or 2.");
                }
            } else {
                System.out.println("Please choose number 1 or 2.");
                scanner.next(); // clear invalid input
            }
        }

        return continueOrResume;
    }

}
