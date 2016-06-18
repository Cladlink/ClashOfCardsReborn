import java.util.ArrayList;

/**
 Created by cladlink on 16/06/16.
 */
class MJoueur
{
    private MPartie partie;
    private String pseudo;
    private boolean isBleu;
    private boolean carteChoisie;
    private ArrayList <MCarte> cartesDuJoueur;

    MJoueur(String pseudo, boolean isBleu, MPartie partie)
    {
        this.pseudo = pseudo;
        this.isBleu = isBleu;
        this.partie = partie;
        this.carteChoisie = !partie.getReglesDeLaPartie().get(0).estChoisi;
    }

    // getters & setters
    public String getPseudo() { return pseudo; }
    public void setPseudo(String pseudo) { this.pseudo = pseudo; }
    public boolean isBleu() { return isBleu; }
    public void setBleu(boolean bleu) { isBleu = bleu; }
    public boolean isCarteChoisie() { return carteChoisie; }
    public void setCarteChoisie(boolean carteChoisie) { this.carteChoisie = carteChoisie; }
    public ArrayList<MCarte> getCartesDuJoueur() { return cartesDuJoueur; }
    public void setCartesDuJoueur(ArrayList<MCarte> cartesDuJoueur) { this.cartesDuJoueur = cartesDuJoueur; }
}
