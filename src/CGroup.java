    /**
     * Created by cladlink on 11/01/16.
     */
    class CGroup
    {

        private MAccueil mAccueil;
        private VAccueil vAccueil;
        private CButtonAccueil cButtonAccueil;
        private CPlateau cPlateau;


        public CGroup(MAccueil mAccueil)
        {
            this.mAccueil = mAccueil;
            vAccueil = new VAccueil(mAccueil);

        }
    }
