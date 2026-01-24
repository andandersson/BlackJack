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


}
