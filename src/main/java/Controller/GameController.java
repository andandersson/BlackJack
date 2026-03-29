package Controller;

import Model.Card;
import View.UserInput;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static Model.CardFactory.createPackOfCards;

public class GameController {

    private Stack<Card> packOfCards;
    private GamePlay gamePlay;
    private UserInput userInput;
    public GameController() {

        this.packOfCards = createPackOfCards();
        this.userInput = new UserInput();
        this.gamePlay = new GamePlay(packOfCards, userInput);
    }

}
