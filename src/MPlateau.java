/**
 Created by cladlink on 15/06/16.
 */
class MPlateau
{
    private MCase[] board;

    MPlateau()
    {
        board = new MCase[9];
    }

    void cartePosee(MCarte cartePosee, int indice)
    {
        board[indice] = new MCase(cartePosee);
    }

    // getters & setters
    MCase[] getBoard() { return board; }
    void setBoard(MCase[] board) { this.board = board; }
}
