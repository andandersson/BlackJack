package Controller;

import Model.Card;

import java.util.Collections;
import java.util.Stack;

public class GamePlay {
    private final int HUMANTURN = 1;
    private final int COMPUTERTURN = 2;
    private int TURN;
    private Stack<Card> packOfCards;

    public void setTurn(int turn) {
        this.TURN = turn;
    }

    public int getTurn(){
        return this.TURN;
    }

    public GamePlay(Stack<Card> packOfCards){
        setTurn(2);
        this.packOfCards = packOfCards;
        Collections.shuffle(packOfCards);
    }

    public void playOneRound(){

    }

    public Card dealCardToPlayer() {
      Card card = this.packOfCards.pop();
      card.setVisible(true);
      return card;
    }


}
