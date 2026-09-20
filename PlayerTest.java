import student.TestCase;
Public class PlayerTest extends TestCase{
  private Player player;
  public void setUp(){
    player = new Player(100);
  }
  public void testConstructor(){
    assertEquals(100, player.getBankroll());
    assertEquals(0, player.getCurrentBet());
    assertNotNull(player.getHand());
  }

  public void testGetHand(){
    Hand hand = player.getHand();
    assertNotNull(hand);
    assertEquals(0, hand.getTotal();
  }

  public void testGetBankroll(){
    assertEquals(100, player.getBankroll());
  }

  public void testCurrentBet(){
    assertEquals(0, player.getCurrentBet());
  }

  public void testPlaceValidBet(){
    assertTrue(player.placeBet(25));
    assertEquals(25, player.getCurrentBet());
    assertEquals(100, player.getBankroll());
  }

  public void testPlaceBetEqualToBankroll(){
    assertTrue(player.placeBet(100));
    assertEquals(100, player.getCurrentBet());
    assertEquals(100, player.getBankroll());
  }

  public void testPlaceBetToBig(){
    assertFalse(player.placeBet(101));
    assertEquals(0, player.getCurrentBet());
    assertEquals(100, player.getBankroll());
  }

  public void testPlaceBetZero(){
    assertFalse(player.placeBet(0));
    assertEquals(0, player.getCurrentBet());
  }

  public void testPlaceBetNegative(){
    assertFalse(player.placeBet(-10));
    assertEquals(0, player.getCurrentBet());
  }

  public void testAddWinnings(){
    player.placeBet(25);
    player.addWinnings();
    assertEquals(150, player.getBankroll());
  }

  public void testSubtractBet(){
    player.placeBet(25);
    player.subtractBet();
    assertEquals(75, player.getBankroll());
  }

public void testAnotherBet(){
    player.placeBet(50);
    assertEquals(50, player.getCurrentBet());
    player.addWinnings();
    assertEquals(200, player.getBankroll());
  }
}
