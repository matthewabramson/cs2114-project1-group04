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


    public void testGetWins()
    {
        assertEquals(stats.getWins(), 0);
        stats.recordWin();
        assertEquals(stats.getWins(), 1);
        stats.recordWin();
        assertEquals(stats.getWins(), 2);
    }


    public void testGetLosses()
    {
        assertEquals(stats.getLosses(), 0);
        stats.recordLoss();
        assertEquals(stats.getLosses(), 1);
        stats.recordLoss();
        assertEquals(stats.getLosses(), 2);
    }


    public void testGetPushes()
    {
        assertEquals(stats.getPushes(), 0);
        stats.recordPush();
        assertEquals(stats.getPushes(), 1);
        stats.recordPush();
        assertEquals(stats.getPushes(), 2);
    }

}
