package Controller;

import Model.Card;
import View.UserInput;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GamePlay {
    private Stack<Card> packOfCards;
    private UserInput userInput;

    public GamePlay(Stack<Card> packOfCards, UserInput userInput){
        this.userInput = userInput;
        this.packOfCards = packOfCards;
        Collections.shuffle(packOfCards);
        this.playGame();
    }

    public Card dealFaceUpCard() {
      Card card = this.packOfCards.pop();
      card.setVisible(true);
      return card;
    }

    public Card dealFaceDownCard() {
        Card card = this.packOfCards.pop();
        card.setVisible(true);
        return card;
    }

    public int checkCardSum (List<Card> cards) {
        int sum = 0;
        for(int i = 0; i<cards.size(); i ++){
            sum = sum + cards.get(i).getValue();
        }
        return sum;
    }


    public void playGame() {
        //one round of the game, continuing as long as at least half of the pack is left
        while (this.packOfCards.size() >= 26) {
            List playerCardList = new LinkedList<Card>();
            System.out.println("New round!");
            Card dealerFaceUpCard = this.dealFaceUpCard();
            Card dealerFaceDownCard = this.dealFaceDownCard();
            Card playerFirstCard = this.dealFaceUpCard();
            Card playerSecondCard = this.dealFaceUpCard();
            playerCardList.add(playerFirstCard);
            playerCardList.add(playerSecondCard);
            dealerFaceDownCard.setVisible(true);
            System.out.println("Player got " + playerFirstCard.getName() + " and "+ playerSecondCard.getName());
            System.out.println("Dealer got " + dealerFaceUpCard.getName()+ " on visible card");

            if (this.checkCardSum(playerCardList) == 21 ){
                System.out.println("Player got blackJack!, player wins this round!");
            }
            if (this.checkCardSum(playerCardList) > 21 ){
                System.out.println("Player got more than 21, the dealer wins this round!");
            }

            else {
                while (true) {
                    int continueOrResume = this.userInput.getUserInputToContinueOrResume(playerFirstCard);
                    if (continueOrResume == 1) {
                        Card nextPlayerCard = this.dealFaceUpCard();
                        playerCardList.add(nextPlayerCard);
                    }
                }
            }
        }
    }

}
