class MAccueil
{
    private MPartie partie;

    MAccueil() {}

    /**
     * initPartie
     *     todo ici il faudra récupérer dans un formulaire le choix des règles du joueur.
     */
    void initPartie()
    {
        partie = new MPartie(true, true, true, true, true, true, true, true);
    }
}