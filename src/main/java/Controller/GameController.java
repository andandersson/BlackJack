package Controller;

import Model.Card;
import View.UserInput;
import java.util.Stack;

import static Model.CardFactory.createPackOfCards;

public class GameController {

    private Stack<Card> packOfCards;
    private GamePlay gamePlay;
    private UserInput userInput;
    public GameController() {

        this.packOfCards = createPackOfCards();
        this.gamePlay = new GamePlay(packOfCards);
        this.userInput = new UserInput();
        this.playGame();

    }

    public void playGame() {
        while (this.packOfCards.size() >= 26) {
            Card playerCard = this.gamePlay.dealCardToPlayer();
            this.userInput.getUserInputToContinueOrResumeDeal(playerCard);
        }
    }

}
