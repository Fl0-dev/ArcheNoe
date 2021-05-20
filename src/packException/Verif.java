package packException;

import animaux.*;

public class Verif {


    /**
     * Méthode pour vérifier si il n'y a pas déjà un couple d'espèce de l'animal en paramètre
     *
     * @param animalTestee animal qui subira la vérification
     * @return verif true si souci
     */
    public static boolean NombreEspeceVerif(Animal animalTestee) {
        boolean verif = false;
        switch (animalTestee.getEspece()) {
            case CHAT:
                if (Chat.getNbchat() > 2) {
                    verif = true;
                }
                break;
            case CHIEN:
                if (Chien.getNbChien() > 2) {
                    verif = true;
                }
                break;
            case LAPIN:
                if (Lapin.getNbLapin() > 2) {
                    verif = true;
                }
                break;
            case GORILLE:
                if (Gorille.getNbGorille() > 2) {
                    verif = true;
                }
        }
        return verif;
    }


    /**
     * Méthode pour vérifier si il n'y a pas déjà un animal de la même espèce et de même sexe
     *
     * @param animalTestee animal qui subira la vérification
     * @return verif true si souci
     */
    public static boolean sexeVerif(Animal animalTestee, Animal[] tab) {
        boolean verif = false;
        switch (animalTestee.getEspece()) {
            case CHAT:
            case CHIEN:
            case GORILLE:
            case LAPIN:
                for (Animal element : tab) {
                    if (element != null) {
                        if (animalTestee.getSexe() == element.getSexe()) {
                            verif = true;
                            break;
                        }
                    }
                }
        }
        return verif;
    }
}

