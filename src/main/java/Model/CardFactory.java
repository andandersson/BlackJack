package Model;


import java.util.Stack;

public class CardFactory {

    public static Stack<Card> createPackOfCards(){
        Stack<Card> packOfCards = new Stack<>();

        Card SpadesAce = new Card(Card.types.SPADES, "SpadesAce", 1, 1, false, false );
        Card Spades2 = new Card(Card.types.SPADES, "Spades2", 2, 2, false, false );
        Card Spades3 = new Card(Card.types.SPADES, "Spades3", 3, 3, false, false );
        Card Spades4 = new Card(Card.types.SPADES, "Spades4", 4, 4, false, false );
        Card Spades5 = new Card(Card.types.SPADES, "Spades5", 5, 5, false, false );
        Card Spades6 = new Card(Card.types.SPADES, "Spades6", 6, 6, false, false );
        Card Spades7 = new Card(Card.types.SPADES, "Spades7", 7, 7, false, false );
        Card Spades8 = new Card(Card.types.SPADES, "Spades8", 8, 8, false, false );
        Card Spades9 = new Card(Card.types.SPADES, "Spades9", 9, 9, false, false );
        Card Spades10 = new Card(Card.types.SPADES, "Spades10", 10, 10, false, false );
        Card SpadesJack = new Card(Card.types.SPADES, "SpadesJack", 11, 10, false, false );
        Card SpadesQueen = new Card(Card.types.SPADES, "SpadesQueen", 12, 10, false, false );
        Card SpadesKing = new Card(Card.types.SPADES, "SpadesKing", 3, 10, false, false );

        Card HeartsAce = new Card(Card.types.HEARTS, "HeartsAce", 1,1, false, false );
        Card Hearts2 = new Card(Card.types.HEARTS, "Hearts2", 2, 2, false, false );
        Card Hearts3 = new Card(Card.types.HEARTS, "Hearts3", 3, 3, false, false );
        Card Hearts4 = new Card(Card.types.HEARTS, "Hearts4", 4, 4, false, false );
        Card Hearts5 = new Card(Card.types.HEARTS, "Hearts5", 5, 5, false, false );
        Card Hearts6 = new Card(Card.types.HEARTS, "Hearts6",6, 6, false, false );
        Card Hearts7 = new Card(Card.types.HEARTS, "Hearts7", 7, 7, false, false );
        Card Hearts8 = new Card(Card.types.HEARTS, "Hearts8", 8, 8, false, false );
        Card Hearts9 = new Card(Card.types.HEARTS, "Hearts9", 9, 9, false, false );
        Card Hearts10 = new Card(Card.types.HEARTS, "Hearts10", 10, 10, false, false );
        Card HeartsJack = new Card(Card.types.HEARTS, "HeartsJack", 11, 10, false, false );
        Card HeartsQueen = new Card(Card.types.HEARTS, "HeartsQueen", 12, 10, false, false );
        Card HeartsKing = new Card(Card.types.HEARTS, "HeartsKing", 13, 10, false, false );

        Card DiamondsAce = new Card(Card.types.DIAMONDS, "DiamondsAce", 1, 1, false, false );
        Card Diamonds2 = new Card(Card.types.DIAMONDS, "Diamonds2", 2, 2, false, false );
        Card Diamonds3 = new Card(Card.types.DIAMONDS, "Diamonds3", 3, 3, false, false );
        Card Diamonds4 = new Card(Card.types.DIAMONDS, "Diamonds4", 4, 4, false, false );
        Card Diamonds5 = new Card(Card.types.DIAMONDS, "Diamonds5", 5, 5, false, false );
        Card Diamonds6 = new Card(Card.types.DIAMONDS, "Diamonds6", 6, 6, false, false );
        Card Diamonds7 = new Card(Card.types.DIAMONDS, "Diamonds7",7, 7, false, false );
        Card Diamonds8 = new Card(Card.types.DIAMONDS, "Diamonds8",8, 8, false, false );
        Card Diamonds9 = new Card(Card.types.DIAMONDS, "Diamonds9", 9, 9, false, false );
        Card Diamonds10 = new Card(Card.types.DIAMONDS, "Diamonds10",10, 10, false, false );
        Card DiamondsJack = new Card(Card.types.DIAMONDS, "DiamondsJack", 11, 10, false, false );
        Card DiamondsQueen = new Card(Card.types.DIAMONDS, "DiamondsQueen",12, 10, false, false );
        Card DiamondsKing = new Card(Card.types.DIAMONDS, "DiamondsKing",13, 10, false, false );

        Card ClubsAce = new Card(Card.types.CLUBS, "ClubsAce",1, 1, false, false );
        Card Clubs2 = new Card(Card.types.CLUBS, "Clubs2",2, 2, false, false );
        Card Clubs3 = new Card(Card.types.CLUBS, "Clubs3",3, 3, false, false );
        Card Clubs4 = new Card(Card.types.CLUBS, "Clubs4",4, 4, false, false );
        Card Clubs5 = new Card(Card.types.CLUBS, "Clubs5",5, 5, false, false );
        Card Clubs6 = new Card(Card.types.CLUBS, "Clubs6",6, 6, false, false );
        Card Clubs7 = new Card(Card.types.CLUBS, "Clubs7",7, 7, false, false );
        Card Clubs8 = new Card(Card.types.CLUBS, "Clubs8",8, 8, false, false );
        Card Clubs9 = new Card(Card.types.CLUBS, "Clubs9",9, 9, false, false );
        Card Clubs10 = new Card(Card.types.CLUBS, "Clubs10",10, 10, false, false );
        Card ClubsJack = new Card(Card.types.CLUBS, "ClubsJack",11, 10, false, false );
        Card ClubsQueen = new Card(Card.types.CLUBS, "ClubsQueen",12, 10, false, false );
        Card ClubsKing = new Card(Card.types.CLUBS, "ClubsKing",13, 10, false, false );

        packOfCards.add(SpadesAce);
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

        packOfCards.add(HeartsAce);
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

        packOfCards.add(DiamondsAce);
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

        packOfCards.add(ClubsAce);
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
