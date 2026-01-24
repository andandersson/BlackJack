package Model;

import java.util.ArrayList;
import java.util.List;

public class CardFactory {

    public static List<Card> createPackOfCards(){
        List<Card> packOfCards = new ArrayList<>();

        Card Spades1 = new Card(Card.types.SPADES, 1, 1, false, false );
        Card Spades2 = new Card(Card.types.SPADES, 2, 2, false, false );
        Card Spades3 = new Card(Card.types.SPADES, 3, 3, false, false );
        Card Spades4 = new Card(Card.types.SPADES, 4, 4, false, false );
        Card Spades5 = new Card(Card.types.SPADES, 5, 5, false, false );
        Card Spades6 = new Card(Card.types.SPADES, 6, 6, false, false );
        Card Spades7 = new Card(Card.types.SPADES, 7, 7, false, false );
        Card Spades8 = new Card(Card.types.SPADES, 8, 8, false, false );
        Card Spades9 = new Card(Card.types.SPADES, 9, 9, false, false );
        Card Spades10 = new Card(Card.types.SPADES, 10, 10, false, false );
        Card SpadesJack = new Card(Card.types.SPADES, 11, 10, false, false );
        Card SpadesQueen = new Card(Card.types.SPADES, 12, 10, false, false );
        Card SpadesKing = new Card(Card.types.SPADES, 13, 10, false, false );

        Card Hearts1 = new Card(Card.types.HEARTS, 1, 1, false, false );
        Card Hearts2 = new Card(Card.types.HEARTS, 2, 2, false, false );
        Card Hearts3 = new Card(Card.types.HEARTS, 3, 3, false, false );
        Card Hearts4 = new Card(Card.types.HEARTS, 4, 4, false, false );
        Card Hearts5 = new Card(Card.types.HEARTS, 5, 5, false, false );
        Card Hearts6 = new Card(Card.types.HEARTS, 6, 6, false, false );
        Card Hearts7 = new Card(Card.types.HEARTS, 7, 7, false, false );
        Card Hearts8 = new Card(Card.types.HEARTS, 8, 8, false, false );
        Card Hearts9 = new Card(Card.types.HEARTS, 9, 9, false, false );
        Card Hearts10 = new Card(Card.types.HEARTS, 10, 10, false, false );
        Card HeartsJack = new Card(Card.types.HEARTS, 11, 10, false, false );
        Card HeartsQueen = new Card(Card.types.HEARTS, 12, 10, false, false );
        Card HeartsKing = new Card(Card.types.HEARTS, 13, 10, false, false );

        Card Diamonds1 = new Card(Card.types.DIAMONDS, 1, 1, false, false );
        Card Diamonds2 = new Card(Card.types.DIAMONDS, 2, 2, false, false );
        Card Diamonds3 = new Card(Card.types.DIAMONDS, 3, 3, false, false );
        Card Diamonds4 = new Card(Card.types.DIAMONDS, 4, 4, false, false );
        Card Diamonds5 = new Card(Card.types.DIAMONDS, 5, 5, false, false );
        Card Diamonds6 = new Card(Card.types.DIAMONDS, 6, 6, false, false );
        Card Diamonds7 = new Card(Card.types.DIAMONDS, 7, 7, false, false );
        Card Diamonds8 = new Card(Card.types.DIAMONDS, 8, 8, false, false );
        Card Diamonds9 = new Card(Card.types.DIAMONDS, 9, 9, false, false );
        Card Diamonds10 = new Card(Card.types.DIAMONDS, 10, 10, false, false );
        Card DiamondsJack = new Card(Card.types.DIAMONDS, 11, 10, false, false );
        Card DiamondsQueen = new Card(Card.types.DIAMONDS, 12, 10, false, false );
        Card DiamondsKing = new Card(Card.types.DIAMONDS, 13, 10, false, false );

        Card Clubs1 = new Card(Card.types.CLUBS, 1, 1, false, false );
        Card Clubs2 = new Card(Card.types.CLUBS, 2, 2, false, false );
        Card Clubs3 = new Card(Card.types.CLUBS, 3, 3, false, false );
        Card Clubs4 = new Card(Card.types.CLUBS, 4, 4, false, false );
        Card Clubs5 = new Card(Card.types.CLUBS, 5, 5, false, false );
        Card Clubs6 = new Card(Card.types.CLUBS, 6, 6, false, false );
        Card Clubs7 = new Card(Card.types.CLUBS, 7, 7, false, false );
        Card Clubs8 = new Card(Card.types.CLUBS, 8, 8, false, false );
        Card Clubs9 = new Card(Card.types.CLUBS, 9, 9, false, false );
        Card Clubs10 = new Card(Card.types.CLUBS, 10, 10, false, false );
        Card ClubsJack = new Card(Card.types.CLUBS, 11, 10, false, false );
        Card ClubsQueen = new Card(Card.types.CLUBS, 12, 10, false, false );
        Card ClubsKing = new Card(Card.types.CLUBS, 13, 10, false, false );

        packOfCards.add(Spades1);
        packOfCards.add(Spades2);
        packOfCards.add(Spades3);
        packOfCards.add(Spades4);
        packOfCards.add(Spades5);
        packOfCards.add(Spades6);
        packOfCards.add(Spades7);
        packOfCards.add(Spades8);
        packOfCards.add(Spades9);
        packOfCards.add(Spades10);
        packOfCards.add(SpadesJack);
        packOfCards.add(SpadesQueen);
        packOfCards.add(SpadesKing);

        packOfCards.add(Hearts1);
        packOfCards.add(Hearts2);
        packOfCards.add(Hearts3);
        packOfCards.add(Hearts4);
        packOfCards.add(Hearts5);
        packOfCards.add(Hearts6);
        packOfCards.add(Hearts7);
        packOfCards.add(Hearts8);
        packOfCards.add(Hearts9);
        packOfCards.add(Hearts10);
        packOfCards.add(HeartsJack);
        packOfCards.add(HeartsQueen);
        packOfCards.add(HeartsKing);

        packOfCards.add(Diamonds1);
        packOfCards.add(Diamonds2);
        packOfCards.add(Diamonds3);
        packOfCards.add(Diamonds4);
        packOfCards.add(Diamonds5);
        packOfCards.add(Diamonds6);
        packOfCards.add(Diamonds7);
        packOfCards.add(Diamonds8);
        packOfCards.add(Diamonds9);
        packOfCards.add(Diamonds10);
        packOfCards.add(DiamondsJack);
        packOfCards.add(DiamondsQueen);
        packOfCards.add(DiamondsKing);

        packOfCards.add(Clubs1);
        packOfCards.add(Clubs2);
        packOfCards.add(Clubs3);
        packOfCards.add(Clubs4);
        packOfCards.add(Clubs5);
        packOfCards.add(Clubs6);
        packOfCards.add(Clubs7);
        packOfCards.add(Clubs8);
        packOfCards.add(Clubs9);
        packOfCards.add(Clubs10);
        packOfCards.add(ClubsJack);
        packOfCards.add(ClubsQueen);
        packOfCards.add(ClubsKing);

        return packOfCards;

    }

}
