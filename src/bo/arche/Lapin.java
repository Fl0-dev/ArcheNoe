package bo.arche;

import enumeration.Espece;
import enumeration.Sexe;

public class Lapin extends Animal{
    private static int nbLapin = 0;
    public Lapin(Sexe sexe, Espece espece) {
        super(sexe, espece);
        nbLapin++;
    }

    public static int getNbLapin() {
        return nbLapin;
    }
}
