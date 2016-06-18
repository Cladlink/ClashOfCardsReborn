/**
 Created by cladlink on 15/06/16.
 */
abstract class MRegles
{
    protected boolean estChoisi;

    abstract void evaluate(MCase caseJouee, MPlateau plateau);
}
