package View;

import Model.Card;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);




    public int getUserInputToContinueOrResumeDeal(Card card){
        System.out.print("You got: "+card.getName() + " press 1 to continue, 2 to resume: ");
        int continueOrResume;
        while (true) {
            System.out.print("You can only enter 1 or 2:");

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
