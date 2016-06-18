/**
 Created by cladlink on 15/06/16.
 */
class MRegleNormal extends MRegles
{

    @Override
    void evaluate(MCase caseJouee, MPlateau plateau)
    {
        MCase[] board = plateau.getBoard();
        MCarte carteJouee = caseJouee.getCarte();
        for (int i = 0; i < board.length; i++)
        {
            if (board[i].equals(caseJouee))
            {
                if ( i+1 < 9
                        && board[i+1].getCarte() != null
                        && board[i+1].getCarte().isBleu() == MPartie.isTourBleu
                        && carteJouee.getE() > board[i+1].getCarte().getO() )
                    board[i+1].getCarte().flip();

                if ( i-1 >= 0
                        && board[i-1].getCarte() != null
                        && board[i-1].getCarte().isBleu() == MPartie.isTourBleu
                        && carteJouee.getO() > board[i-1].getCarte().getE() )
                    board[i-1].getCarte().flip();

                if ( i+MPlateau.row < 9
                        && board[i-MPlateau.row].getCarte() != null
                        && board[i-MPlateau.row].getCarte().isBleu() == MPartie.isTourBleu
                        && carteJouee.getO() > board[i-MPlateau.row].getCarte().getE() )
                    board[i-MPlateau.row].getCarte().flip();

                if ( i-MPlateau.row >= 0
                        && board[i+MPlateau.row].getCarte() != null
                        && board[i+MPlateau.row].getCarte().isBleu() == MPartie.isTourBleu
                        && carteJouee.getO() > board[i+MPlateau.row].getCarte().getE() )
                    board[i+MPlateau.row].getCarte().flip();
            }
        }
    }
}
