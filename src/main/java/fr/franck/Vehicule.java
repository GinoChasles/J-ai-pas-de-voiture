package fr.franck;

public class Vehicule {
    String marqueVehicule;
    String couleurVehicule;
    String etatVehicule;
    int niveauEnergie;
    int energieMax;
    boolean enStock;
    boolean estLoué;

    public Vehicule(String marqueVehicule, String couleurVehicule, String etatVehicule, int niveauEnergie, int energieMax, boolean enStock, boolean estLoué) {
        this.marqueVehicule = marqueVehicule;
        this.couleurVehicule = couleurVehicule;
        this.etatVehicule = etatVehicule;
        this.energieMax = 100;
        this.enStock = enStock;
        this.estLoué = estLoué;
    }

    public void alerteReserve(Vehicule vehicule) {
        if (vehicule.niveauEnergie <= 10) {
            System.out.println("ALERTE RESERVE!");
            System.out.println("Veuillez faire le plein.");
        }
    }



}
