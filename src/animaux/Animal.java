package animaux;

import enumeration.Espece;
import enumeration.Sexe;

/**
 * classe  abstraite Animal
 * avec comme attribut
 * l'espèce (énumération)
 * le sexe (énumération)
 */
public class Animal {
    Sexe sexe;
    Espece espece;

    public Animal() {
    }

    public Animal(Sexe sexe, Espece espece) {
        this.sexe = sexe;
        this.espece = espece;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public Espece getEspece() {
        return espece;
    }

}
