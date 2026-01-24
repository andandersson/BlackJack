package Controller;

import Model.CardFactory;

public class GameController {

    public GameController() {
        CardFactory.createPackOfCards();
        GamePlay gamePlay = new GamePlay();
    }

}
