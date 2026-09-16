import static org.junit.Assert.*;
import org.junit.Test;

public class DealerTest{

  @Test
  public void testGetHand() {
    Dealer dealer = new Dealer();

    assertNotNull(dealer.getHand()); 
  }

  @Test
  public void testShouldHitBelow17() { 
    Dealer dealer = new Dealer();

    dealer.getHand().addCard(new Card("10", 10)); 
    dealer.getHand().addCard(new Card)"6", 6)); 

    assertTrue(dealer.shouldHit(); 
  }

  @Test 
  public void testShouldHitAt17() { 
    Dealer dealer = new Dealer();

    dealer.getHand().addCard(new Card("10", 10)); 
    dealer.getHand().addCard(new Card)"7", 7)); 
    
    assertTrue(dealer.shouldHit(); 
  }

  @Test 
  public void testShouldHitAbove17() { 
    Dealer dealer = new Dealer();

    dealer.getHand().addCard(new Card("10", 10)); 
    dealer.getHand().addCard(new Card)"8", 8)); 

    assertFalse(dealer.shouldHit(); 
  }
}
    
