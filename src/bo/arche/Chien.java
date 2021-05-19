package bo.arche;

import enumeration.Espece;
import enumeration.Sexe;

public class Chien extends Animal{
    private static int nbChien = 0;
    public Chien(Sexe sexe, Espece espece) {
        super(sexe, espece);
        nbChien++;
    }

    public static int getNbChien() {
        return nbChien;
    }
}
