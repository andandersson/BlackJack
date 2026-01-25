package Controller;

import Model.Card;
import Model.CardFactory;
import View.UserInput;
import java.util.List;
import static Model.CardFactory.createPackOfCards;

public class GameController {
    public GameController() {

        List<Card> packOfCards = createPackOfCards();
        GamePlay gamePlay = new GamePlay(packOfCards);
        UserInput userInput = new UserInput();
    }

}
