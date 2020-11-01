package fr.franck;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Agence agenceNantes = new Agence("J'ai pas de voiture - Nantes", "Gino");
        Agence agenceRennes = new Agence("J'ai pas de voiture - Rennes", "Jean-Gino");
        Agence agenceBrest = new Agence("J'ai pas de voiture - Brest", "Bernard-Gino");
        
        Voiture tacot1 = new Voiture("vieille R19", "blanche", "miteuse", "diesel", 90, 100, 250000, 5, false, false);
        Voiture voiturePotable1 = new Voiture("C3", "grise", "en bon etat", "essence", 60, 100, 50000, 5, false, false);
        Voiture tacot2 = new Voiture("Fiat Uno", "rose", "rouillée", "essence", 80, 100, 180000, 5, false, false);
        Voiture voiturePotable2 = new Voiture("Peugeot205", "verte", "en bon état", "diesel", 80, 100, 100000, 5, false, false);
        Voiture voitureDuFutur1 = new Voiture("Tesl'Hamza", "noire", "neuve", "electrique", 5, 100, 10, 2, false, false);
        Velo veloDuFutur1 = new Velo(true, "Tesl'Hamza", "noir", "neuf", 50, 100, false, false);
        
        Client manu = new Client("Manu");
        Client guillaume = new Client("Guillaume");
        
        agenceNantes.saluer();
        agenceNantes.stockerVehicule(agenceNantes, tacot1);
        agenceNantes.stockerVehicule(agenceNantes, voiturePotable1);
        agenceNantes.checkerStock();
        
        agenceBrest.saluer();
        agenceBrest.stockerVehicule(agenceBrest, tacot1);//Si l'on essaie de louer une voiture d'un autre stock ou déjà louée.
        agenceBrest.stockerVehicule(agenceBrest, voiturePotable2);
        agenceBrest.checkerStock();
        
        agenceRennes.saluer();
        agenceRennes.stockerVehicule(agenceRennes, tacot2);
        agenceRennes.stockerVehicule(agenceRennes, voitureDuFutur1);
        agenceRennes.stockerVehicule(agenceRennes, veloDuFutur1);
        agenceRennes.checkerStock();
        
        agenceNantes.louerVehicule(manu, tacot1);
        agenceNantes.louerVehicule(guillaume, tacot1);//Si un client essaie de louer une voiture déjà louée.
        agenceNantes.rendreVehiculeLoué(manu, tacot1);
        agenceNantes.checkerStock();




        
        
    }
}
