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

    /**
     * constructeur vide
     * permettant d'initialiser
     * un animal pour utiliser sa création avec un
     * autre constructeur dans une boucle
     */
    public Animal() {
    }

    /**
     * Constructeur principal d'Animal
     * @param sexe de l'animal (enumération)
     * @param espece de l'animal (enumération)
     */
    public Animal(Sexe sexe, Espece espece) {
        this.sexe = sexe;
        this.espece = espece;
    }
//////////Getters///////////////
    public Sexe getSexe() {
        return sexe;
    }

    public Espece getEspece() {
        return espece;
    }

}
