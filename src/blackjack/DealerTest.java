package blackjack;


public class DealerTest extends student.TestCase{

  
  public void testGetHand() {
    Dealer dealer = new Dealer();

    assertNotNull(dealer.getHand()); 
  }

  
  public void testShouldHitBelow17() { 
    Dealer dealer = new Dealer();

    dealer.getHand().addCard(new Card("10", "♠\uFE0F", 10)); 
    dealer.getHand().addCard(new Card("6","♥\uFE0F", 6)); 

    assertTrue(dealer.shouldHit()); 
  }

  
  public void testShouldHitAt17() { 
    Dealer dealer = new Dealer();

    dealer.getHand().addCard(new Card("10", "♠\uFE0F", 10)); 
    dealer.getHand().addCard(new Card("7","♥\uFE0F", 7)); 
    
    assertTrue(dealer.shouldHit()); 
  }

  
  public void testShouldHitAbove17() { 
    Dealer dealer = new Dealer();

    dealer.getHand().addCard(new Card("10","♠\uFE0F", 10)); 
    dealer.getHand().addCard(new Card("8", "♥\uFE0F", 8)); 

    assertFalse(dealer.shouldHit()); 
  }

  
  public void testClearHand() {
    Dealer dealer = new Dealer(); 

    dealer.getHand().addCard(new Card("10","♠\uFE0F", 10));
    dealer.getHand().addCard( new Card("5", "♥\uFE0F", 5)); 

    assertEquals(15, dealer.getHand().getTotal()); 

    dealer.clearHand(); 

    assertEquals(0, dealer.getHand().getTotal());
  }
}
    
