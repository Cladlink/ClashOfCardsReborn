import java.util.ArrayList;

/**
 Created by cladlink on 15/06/16.
 */
class MPlateau
{
    private MCase[] board;
    static final int row = 3;

    MPlateau()
    {
        board = new MCase[9];
    }

    /**
     * cartePosee
     * pose une carte sur le plateau
     *
     * @param cartePosee (carte posée)
     * @param indice (emplacement sur le plateau de la carte)
     */
    void cartePosee(MCarte cartePosee, int indice)
    {
        board[indice] = new MCase(cartePosee);
    }

    // getters & setters
    MCase[] getBoard() { return board; }
    void setBoard(MCase[] board) { this.board = board; }
}