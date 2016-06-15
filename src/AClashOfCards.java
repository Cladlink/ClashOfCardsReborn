/**
 * Created by cladlink on 21/01/16.
 */
public class AClashOfCards
{
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                MAccueil mAccueil = new MAccueil();
                CGroup controler = new CGroup(mAccueil);
            }
        });
    }
}
