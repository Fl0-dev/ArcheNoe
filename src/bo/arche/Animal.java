package bo.arche;

import enumeration.Espece;
import enumeration.Sexe;
import main.Message;

/**
 * classe  abstraite Animal
 * avec comme attribut
 * l'espèce (énumération)
 * le sexe (énumération)
 */
public class Animal {
    Sexe sexe;
    Espece espece;

    public Animal(Sexe sexe, Espece espece) {
        this.sexe = sexe;
        this.espece = espece;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "sexe=" + sexe +
                ", espece=" + espece +
                '}';
    }
}
