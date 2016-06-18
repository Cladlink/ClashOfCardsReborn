/**
 Created by cladlink on 15/06/16.
 */
class MRegleIdentique extends MRegleCombo
{

    @Override
    void evaluate(MCase caseJouee, MPlateau plateau)
    {
        MCase[] board = plateau.getBoard();
        MCarte carteJouee = caseJouee.getCarte();
        MCarte carteUp = null, carteRight = null, carteDown = null, carteLeft = null;
        for (int i = 0; i < board.length; i++)
        {
            if (board[i].equals(caseJouee))
            {
                // pour plus de lisibilité
                if (i-MPlateau.row > 0)
                    carteUp = board[i-MPlateau.row].getCarte();
                if (i-1 > 0)
                    carteRight = board[i-1].getCarte();
                if (i+MPlateau.row < 9)
                    carteDown = board[i+MPlateau.row].getCarte();
                if (i+1 < 9)
                    carteLeft = board[i+1].getCarte();
                
                
                if( carteUp != null
                        && carteJouee.getN() == carteUp.getS())
                {
                    if (carteRight != null
                            && carteJouee.getO() == carteRight.getE())
                    {
                        flipId(carteUp, carteRight);
                    }
                    if (carteDown != null
                            && carteJouee.getS() == carteDown.getN())
                    {
                        flipId(carteUp, carteDown);
                    }
                    if (carteLeft != null
                            && carteJouee.getE() == carteLeft.getO())
                    {
                        flipId(carteUp, carteLeft);
                    }
                }

                if (carteRight != null
                        && carteJouee.getE() == carteRight.getO())
                {
                    if (carteDown != null
                            && carteJouee.getS() == carteDown.getN())
                    {
                        flipId(carteRight, carteDown);
                    }
                    if (carteLeft != null
                            && carteJouee.getO() == carteLeft.getE())
                    {
                        flipId(carteRight, carteLeft);
                    }
                }

                if (carteDown != null && carteLeft != null
                        && carteJouee.getS() == carteLeft.getN()
                        && carteJouee.getO() == carteLeft.getE())
                {
                    flipId(carteDown, carteLeft);
                }
            }
        }
    }
    private void flipId(MCarte carteAFlip, MCarte autreCarteAFlip)
    {
        carteAFlip.flip();
        autreCarteAFlip.flip();
        combo(carteAFlip, autreCarteAFlip);
    }
}
