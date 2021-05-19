package bo.arche;

import animaux.*;

public class Stock {



    public static int stockViande() {
        return (Chat.getNbchat()+ Chien.getNbChien())* Carnivore.POIDSVIANDE;
    }
    public static int stockVegetaux() {
        return (Lapin.getNbLapin() + Gorille.getNbGorille()) * Vegetarien.POIDSVEGETAUX;
    }

}
