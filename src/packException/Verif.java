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
        //pour les animaux du tableau
        for (Animal element : tab) {
            //si la case n'est pas nul
                    if (element != null) {
                        //et si le sexe et la classe sont les même
                        if (animalTestee.getSexe() == element.getSexe() && animalTestee.getEspece()==element.getEspece()) {
                            //alors souci
                            verif = true;
                            break;
                        }
                    }
                }
        return verif;
    }
}

