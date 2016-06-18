/**
 Created by cladlink on 15/06/16.
 */
class MRegleMurCasse extends MRegles
{

    @Override
    void evaluate(MCase caseJouee, MPlateau plateau)
    {
        MCase[] board = plateau.getBoard();
        MCarte carteJouee = caseJouee.getCarte();
        for (int i = 0; i < board.length; i++)
        { // todo : if mur cassé alors pas normal
            if (board[i].equals(caseJouee))
            {
                if ( board[(i+1) % 9].getCarte() != null
                        && board[(i+1) % 9].getCarte().isBleu() == MPartie.isTourBleu
                        && carteJouee.getE() > board[(i+1) % 9].getCarte().getO() )
                    board[(i+1) % 9].getCarte().flip();

                if ( board[(i-1) % 9].getCarte() != null
                        && board[(i-1) % 9].getCarte().isBleu() == MPartie.isTourBleu
                        && carteJouee.getO() > board[(i-1) % 9].getCarte().getE() )
                    board[(i-1) % 9].getCarte().flip();

                if ( board[(i-MPlateau.row) % 9].getCarte() != null
                        && board[(i-MPlateau.row) % 9].getCarte().isBleu() == MPartie.isTourBleu
                        && carteJouee.getO() > board[(i-MPlateau.row) % 9].getCarte().getE() )
                    board[(i-MPlateau.row) % 9].getCarte().flip();

                if ( board[(i+MPlateau.row) % 9].getCarte() != null
                        && board[(i+MPlateau.row) % 9].getCarte().isBleu() == MPartie.isTourBleu
                        && carteJouee.getO() > board[(i+MPlateau.row) % 9].getCarte().getE() )
                    board[(i+MPlateau.row) % 9].getCarte().flip();
            }
        }

    }
}
