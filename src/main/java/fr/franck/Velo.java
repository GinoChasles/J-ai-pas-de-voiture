package fr.franck;

public class Velo extends Vehicule{
    boolean typeVelo;

    public Velo(boolean typeVelo, String marqueVehicule, String couleurVehicule, String etatVehicule, int niveauEnergie, int energieMax, boolean enStock, boolean estLoué) {
        super(marqueVehicule, couleurVehicule, etatVehicule, niveauEnergie, energieMax, enStock, estLoué);
        this.typeVelo = true;
    }
}
