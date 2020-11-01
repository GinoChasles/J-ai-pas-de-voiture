package fr.franck;

import java.util.ArrayList;

public class Agence {
    String nomAgence;
    String nomCommercial;
    ArrayList<Vehicule> stockVehicule;

    public Agence(String nomAgence, String nomCommercial) {
        this.nomAgence = nomAgence;
        this.nomCommercial = nomCommercial;

        this.stockVehicule = new ArrayList<Vehicule>();
    }

    public void saluer() {

        System.out.println(
                "Bienvenue à l'agence \"" + this.nomAgence + "\", " + this.nomCommercial + " pour vous servir.");
    }

    public void stockerVehicule(Agence nomAgence, Vehicule vehicule) {

        if ((vehicule.enStock == false) && (vehicule.estLoué == false)) {
            this.stockVehicule.add(vehicule);
            vehicule.enStock = true;
        } else {
            System.out.println("L'agence \"" + this.nomAgence + "\" n'a actuellement pas accès à la "
                    + vehicule.marqueVehicule + ".");
        }

    }

// Note concernant la méthode checkerStock():    
// J'ai tenté de faire la distinction pendant le check entre voiture et velo 
// (pour le sysout, remplacer le "une" par "un") sans succès,
// certaines subtilités m'échappent encore.

    public void checkerStock() {

        if (!this.stockVehicule.isEmpty()) {
            System.out.println("A l'agence \"" + this.nomAgence + "\" nous avons à disposition :");

            for (Vehicule vehicule : stockVehicule) {
                if (vehicule.enStock == true && vehicule.estLoué == false) {
                    // if (vehicule.typeVelo == true) {
                    //     System.out.println("un " + vehicule.typeVelo + " " + vehicule.etatVehicule + ".");
                    // } else {
                        System.out.println("une " + vehicule.marqueVehicule + " " + vehicule.etatVehicule + ".");
                    // }
                }
            }

        } else {
            System.out.println("Veuillez nous excuser");
            System.out.println("L'agence \"" + this.nomAgence + "\" est actuellement en rupture de stock.");
        }
    }

    public void louerVehicule(Client client, Vehicule vehicule) {

        if ((vehicule.enStock == true) && (vehicule.estLoué == false)) {
            vehicule.estLoué = true;
            vehicule.enStock = false;
            rechargerEnergie(vehicule);
            client.locationClient = vehicule.marqueVehicule;

            System.out.println(client.nomClient + " a loué une " + vehicule.marqueVehicule + " à l'agence\" "
                    + this.nomAgence + ".");

        } else {
            System.out.println("Veuillez nous excuser " + client.nomClient + ".");
            System.out.println("Ce vehicule est actuellement indisponible.");
        }
    }

    public void rendreVehiculeLoué(Client client, Vehicule vehicule) {

        if (client.locationClient.equals(vehicule.marqueVehicule)) {
            client.locationClient = "";
            vehicule.estLoué = false;
            vehicule.enStock = true;
            System.out.println("\"" + this.nomAgence + "\"" + " vous remercie pour votre confiance.");
            System.out.println("A bientot.");
        }

    }

    public void rechargerEnergie(Vehicule vehicule) {

        if (vehicule.niveauEnergie <= 70) {
            vehicule.niveauEnergie = vehicule.energieMax;
            // System.out.println(vehicule.niveauEnergie);
        }

    }
}
