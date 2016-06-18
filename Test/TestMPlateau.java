import org.junit.Assert;
import org.junit.Test;

/**
 Created by cladlink on 15/06/16.
 */
public class TestMPlateau
{
    @Test
    public void testCarteJouee()
    {
        MPlateau plateau = new MPlateau();
        MCarte carte = new MCarte(2, 5, 6, 1, "toto", "titi", true);
        plateau.cartePosee(carte, 1);
        Assert.assertEquals(carte, plateau.getBoard()[1].getCarte());
    }
}
