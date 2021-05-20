package bo.arche;

import animaux.*;

/**
 * Classe Stock de l'arche
 * qui contient les méthodes pour remplir le stock
 * de nourriture selon les animaux présents
 * sur l'arche
 */
public class Stock {


    /**
     * @return le nombre de kilo de viande
     * selon les carnivores présents
     */
    public static int stockViande()                                                                                              {
        return (Chat.getNbchat()+ Chien.getNbChien())* Carnivore.POIDSVIANDE;
    }

    /**
     * @return  le nombre de végétaux
     * selon les végétariens
     */
    public static int stockVegetaux() {
        return (Lapin.getNbLapin() + Gorille.getNbGorille()) * Vegetarien.POIDSVEGETAUX;
    }
}
