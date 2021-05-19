package animaux;

import enumeration.Espece;
import enumeration.Sexe;

public class Gorille extends Animal implements Vegetarien {
    private static int nbGorille = 0;

    public Gorille(Sexe sexe, Espece espece) {
        super(sexe, espece);
        nbGorille++;
    }

    public static int getNbGorille() {
        return nbGorille;
    }
}

