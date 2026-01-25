package Controller;

import Model.Card;

import java.util.Collections;
import java.util.List;

public class GamePlay {
    private final int HUMANTURN = 1;
    private final int COMPUTERTURN = 2;
    private int TURN;
    private List<Card> packOfCards;

    public void setTurn(int turn) {
        this.TURN = turn;
    }

    public int getTurn(){
        return this.TURN;
    }

    public GamePlay(List<Card> packOfCards){
        setTurn(2);
        this.packOfCards = packOfCards;
        Collections.shuffle(packOfCards);
        for(Card card : packOfCards){
            System.out.println(card.getName());
        }
    }


}
