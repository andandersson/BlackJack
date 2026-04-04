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
            System.out.println("Player has got: "+cards.get(i).getName());
        }
        if (sum == 21 ){
            System.out.println("Player got blackJack!, player wins this round!");
        }
        if (sum > 21 ){
            System.out.println("Player got more than 21, the dealer wins this round!");
        }
        System.out.println("total sum is: "+ sum);
        return sum;
    }

    public int checkDealerCardSum(int cardOne, int cardTwo) {
        return cardOne + cardTwo;
    }

    public void compare(int playerCardSum, int dealerCardSum) {
        if( playerCardSum > dealerCardSum) {
            System.out.println("Player wins this round!");
        }
        else if (playerCardSum < dealerCardSum) {
            System.out.println("Dealer wins this round!");
        }
        else {
            System.out.println("Both dealer and player has 21, even!");
        }

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
            int playerCardSum;
            playerCardList.add(playerFirstCard);
            playerCardList.add(playerSecondCard);
            dealerFaceDownCard.setVisible(true);
            System.out.println("Player got " + playerFirstCard.getName() + " and "+ playerSecondCard.getName());
            System.out.println("Dealer got " + dealerFaceUpCard.getName()+ " on visible card");

            while (true) {
                int continueOrResume = this.userInput.getUserInputToContinueOrResume(playerFirstCard);
                if (continueOrResume == 1) {
                    Card nextPlayerCard = this.dealFaceUpCard();
                    playerCardList.add(nextPlayerCard);
                }
                else {
                    break;
                }
                playerCardSum = this.checkCardSum(playerCardList);
                if ( playerCardSum >= 21 ) {
                    break;
                }
            }
            this.dealFaceDownCard().setVisible(true);
            System.out.println("dealers reveals hidden card: "+this.dealFaceDownCard().getName());

            this.checkDealerCardSum(this.dealFaceUpCard().getNumber(), this.dealFaceDownCard().getNumber());


            System.out.println("----------------------------------------------------------------");

        }
    }
}


