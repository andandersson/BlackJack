import Model.Card;
import org.junit.Test;

import java.util.List;

import static Model.CardFactory.createPackOfCards;
import static org.junit.Assert.*;

public class TestCardFactory {

   @Test
    public void testCardPackCreated() {

       List<Card> pack = createPackOfCards();
       assertFalse(pack.isEmpty());
       assertEquals(pack.size(), 52);

   }

   @Test
   public void testCardPackHasCorrectNamesForCards() {
      List<Card> pack = createPackOfCards();

      //Spades
      assertEquals("SpadesAce", pack.get(0).getName());
      for(int i = 2; i< 10; i++){
         assertEquals("Spades"+i, pack.get(i-1).getName());
       }
      assertEquals("SpadesJack", pack.get(10).getName());
      assertEquals("SpadesQueen", pack.get(11).getName());
      assertEquals("SpadesKing", pack.get(12).getName());

      //Hearts
      assertEquals("HeartsAce", pack.get(13).getName());


      for(int i = 15; i< 23; i++){
         assertEquals("Hearts"+(i-13), pack.get(i-1).getName());
      }
      assertEquals("HeartsJack", pack.get(23).getName());
      assertEquals("HeartsQueen", pack.get(24).getName());
      assertEquals("HeartsKing", pack.get(25).getName());

      //Diamonds
      assertEquals("DiamondsAce", pack.get(26).getName());

      for(int i = 28; i< 36; i++){
         assertEquals("Diamonds"+(i-26), pack.get(i-1).getName());
      }
      assertEquals("DiamondsJack", pack.get(36).getName());
      assertEquals("DiamondsQueen", pack.get(37).getName());
      assertEquals("DiamondsKing", pack.get(38).getName());

      //Clubs
      assertEquals("ClubsAce", pack.get(39).getName());

      for(int i = 42; i< 50; i++){
         assertEquals("Clubs"+(i-39), pack.get(i-1).getName());
      }

      assertEquals("ClubsJack", pack.get(49).getName());
      assertEquals("ClubsQueen", pack.get(50).getName());
      assertEquals("ClubsKing", pack.get(51).getName());

   }


}
