package fr.franck;

public class Voiture extends Vehicule {
    String typeEnergie;
    int kilometrage;
    int nbrePlaces;

    public Voiture(String marqueVehicule, String couleurVehicule, String etatVehicule, String typeEnergie, int niveauEnergie, int energieMax, int kilometrage, int nbrePlaces, boolean enStock, boolean estLoué) {
        super(marqueVehicule, couleurVehicule, etatVehicule, niveauEnergie, energieMax, enStock, estLoué);
        this.typeEnergie = typeEnergie;
        this.niveauEnergie = niveauEnergie;
        this.kilometrage = kilometrage;
        this.nbrePlaces = nbrePlaces;
    }
}
