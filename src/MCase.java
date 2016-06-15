/**
 Created by cladlink on 15/06/16.
 */
class MCase
{
    private MCarte carte;

    MCase(MCarte carte)
    {
        this.carte = carte;
    }

    //Getters & Setters

    MCarte getCarte() { return carte; }
    void setCarte(MCarte carte) { this.carte = carte; }
}
