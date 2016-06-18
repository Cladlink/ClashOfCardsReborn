import java.util.ArrayList;

/**
 Created by cladlink on 15/06/16.
 */
class MPartie
{
    private ArrayList<MRegles> reglesDeLaPartie;
    private MPlateau plateau;
    private MJoueur joueurBleu, joueurRouge;

    static boolean isTourBleu;

    MPartie(boolean alea, boolean identique, boolean murCasse, boolean murPuissant, boolean normal, boolean open,
            boolean openPartiel, boolean plus, String pseudoJoueur1, String pseudoJoueur2)
    {
        plateau = new MPlateau();

        initJoueur(pseudoJoueur1, pseudoJoueur2);

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

    /**
     * initJoueur
     * initialise les objets joueur et définit de facon aleatoire qui est le joueur bleu et le joueur rouge
     *
     * @param pseudoJoueur1 (pseudo du joueur 1)
     * @param pseudoJoueur2 (pseudo du joueur 2)
     */
    private void initJoueur(String pseudoJoueur1, String pseudoJoueur2)
    {
        if (Math.random() > 0.5)
        {
            joueurBleu = new MJoueur(pseudoJoueur1, true, this);
            joueurRouge = new MJoueur(pseudoJoueur2, false, this);
        }
        else
        {
            joueurBleu = new MJoueur(pseudoJoueur2, true, this);
            joueurRouge = new MJoueur(pseudoJoueur1, false, this);
        }
    }

    ArrayList<MRegles> getReglesDeLaPartie() { return reglesDeLaPartie; }
    void setReglesDeLaPartie(ArrayList<MRegles> reglesDeLaPartie) { this.reglesDeLaPartie = reglesDeLaPartie; }
    MPlateau getPlateau() { return plateau; }
    void setPlateau(MPlateau plateau) { this.plateau = plateau; }
    MJoueur getJoueurBleu() { return joueurBleu; }
    void setJoueurBleu(MJoueur joueurBleu) { this.joueurBleu = joueurBleu; }
    MJoueur getJoueurRouge() { return joueurRouge; }
    void setJoueurRouge(MJoueur joueurRouge) { this.joueurRouge = joueurRouge; }

}
