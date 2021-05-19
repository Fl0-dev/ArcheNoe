package animaux;

import enumeration.Espece;
import enumeration.Sexe;

public class Chien extends Animal implements Carnivore {
    private static int nbChien = 0;
    public Chien(Sexe sexe, Espece espece) {
        super(sexe, espece);
        nbChien++;
    }

    public static int getNbChien() {
        return nbChien;
    }
}
