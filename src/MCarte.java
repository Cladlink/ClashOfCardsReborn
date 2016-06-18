/**
 Created by cladlink on 15/06/16.
 */
class MCarte
{
    private int n, s, e, o;
    private String adresse;
    private String nom;
    private boolean isBleu;
    private boolean isVisible;

    MCarte(int n, int s, int e, int o, String adresse, String nom, boolean isBleu)
    {
        this.n = n;
        this.s = s;
        this.e = e;
        this.o = o;
        this.adresse = adresse;
        this.nom = nom;
        this.isBleu = isBleu;
        this.isVisible = false;
    }

    /**
     * flip
     *
     * la carte passe à l'adversaire
     */
    void flip()
    {
        isBleu = !isBleu;
    }

    // Getters & Setters
    int getN(){ return n; }
    void setN(int n) { this.n = n; }
    int getS() { return s; }
    void setS(int s) { this.s = s; }
    int getE() { return e; }
    void setE(int e) { this.e = e; }
    int getO() { return o; }
    void setO(int o) { this.o = o; }
    String getAdresse() { return adresse; }
    void setAdresse(String adresse) { this.adresse = adresse; }
    String getNom() { return nom; }
    void setNom(String nom) { this.nom = nom; }
    boolean isBleu() { return isBleu; }
    void setBleu(boolean bleu) { isBleu = bleu; }
    boolean isVisible() { return isVisible; }
    void setVisible(boolean visible) { isVisible = visible; }
}
