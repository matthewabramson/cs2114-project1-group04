package blackjack;

import student.TestCase;

public class StatisticsTest
    extends TestCase
{
    private Statistics stats;

    /**
     * sets up statistics class
     */
    public void setUp()
    {
        stats = new Statistics();
    }


    /**
     * This test the getWins() method and makes sure that it returns the 
     * correct outcome 
     */
    public void testGetWins()
    {
        assertEquals(stats.getWins(), 0);
        stats.recordWin();
        assertEquals(stats.getWins(), 1);
        stats.recordWin();
        assertEquals(stats.getWins(), 2);
    }

    /**
     * This test the getLosses() method and makes sure that it returns the 
     * correct outcome when the user gets a loss
     */
    public void testGetLosses()
    {
        assertEquals(stats.getLosses(), 0);
        stats.recordLoss();
        assertEquals(stats.getLosses(), 1);
        stats.recordLoss();
        assertEquals(stats.getLosses(), 2);
    }

    /**
     * This test the getPushes() method and makes sure that it returns the 
     * correct outcome when the user pushes against the dealer
     */
    public void testGetPushes()
    {
        assertEquals(stats.getPushes(), 0);
        stats.recordPush();
        assertEquals(stats.getPushes(), 1);
        stats.recordPush();
        assertEquals(stats.getPushes(), 2);
    }

}
