import java.util.ArrayList;

/**
 Created by cladlink on 15/06/16.
 */
class MPartie
{
    private ArrayList<MRegles> reglesDeLaPartie;
    private MPlateau plateau;

    MPartie(boolean alea, boolean identique, boolean murCasse, boolean murPuissant, boolean normal, boolean open,
            boolean openPartiel, boolean plus)
    {
        plateau = new MPlateau();

        reglesDeLaPartie = new ArrayList<>();
        //règles d'état de jeu: elles ne se font qu'une fois au début de la partie.
        if (alea)
            reglesDeLaPartie.add(new MRegleAlea());
        else if (open)
            reglesDeLaPartie.add(new MRegleOpen());
        else if (openPartiel)
            reglesDeLaPartie.add(new MRegleOpenPartiel());
        //règles necessaire au calcul des coups par ordre de priorité
        else if (murCasse)
            reglesDeLaPartie.add(new MRegleMurCasse());
        else if (murPuissant)
            reglesDeLaPartie.add(new MRegleMurPuissant());
        else if (identique)
            reglesDeLaPartie.add(new MRegleIdentique());
        else if (plus)
            reglesDeLaPartie.add(new MReglePlus());
        else if (normal)
            reglesDeLaPartie.add(new MRegleNormal());
    }
}
