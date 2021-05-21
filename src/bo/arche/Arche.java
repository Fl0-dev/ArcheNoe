package bo.arche;

import animaux.*;
import enumeration.Espece;
import enumeration.Sexe;
import main.Message;
import packException.EspeceException;
import packException.SexeException;
import packException.Verif;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Arche
 * qui regroupe 8 animaux maximum
 * dans un tableau en attribut
 */
public class Arche {
    //création du tableau de stockage des animaux
    List<Animal> animaux = new ArrayList<>();

    /**
     * Constructeur
     */
    public Arche() {
    }

    /**
     * Enregistrement lors de la montée dans le bateau
     * avec création et ajout d'un animal
     */
    public void arrivant(){
        //création du compteur de capacité et initialisation
        int capacite = 0;
        // création des variables de la méthode
        String nomAnimal;
        Animal arrivant = new Animal();
        int sexe;
        int espece;

        while (true) {
            try {
                //récupération du nom
                nomAnimal = Message.nom();
                //récupération du sexe
                sexe = Message.sexe();
                //récupération de l'espèce
                espece = Message.espece();
                //selon l'espèce et le sexe création de l'animal
                switch (espece) {
                    case 0:
                        if (sexe == 0) {
                            arrivant = new Chat(Sexe.MASCULIN, Espece.CHAT);

                        } else {
                            arrivant = new Chat(Sexe.FEMININ, Espece.CHAT);
                        }
                        break;
                    case 1:
                        if (sexe == 0) {
                            arrivant = new Chien(Sexe.MASCULIN, Espece.CHIEN);
                        } else {
                            arrivant = new Chien(Sexe.FEMININ, Espece.CHIEN);
                        }
                        break;
                    case 2:
                        if (sexe == 0) {
                            arrivant = new Gorille(Sexe.MASCULIN, Espece.GORILLE);
                        } else {
                            arrivant = new Gorille(Sexe.FEMININ, Espece.GORILLE);
                        }
                        break;
                    case 3:
                        if (sexe == 0) {
                            arrivant = new Lapin(Sexe.MASCULIN, Espece.LAPIN);
                        } else {
                            arrivant = new Lapin(Sexe.FEMININ, Espece.LAPIN);
                        }
                        break;
                    default:
                        //si souci inconnu dans la saisie
                        throw new IllegalStateException("Mauvaise saisie");
                }
                //si souci sur le nombre d'espèce retourne vrai
                if (Verif.NombreEspeceVerif(arrivant)) {
                    //lève l'exception
                    throw new EspeceException("On a déjà un couple de ton espèce. Désolé. Suivant!!");
                //si souci sur le nombre d'espèce du même sexe
                }
                else if (Verif.sexeVerif(arrivant, animaux)) {
                    throw new SexeException("On a déjà une espèce de même sexe. Désolé. Suivant!!");
                }
                //coupe la boucle si AUCUN souci de vérification
                break;
                //traite l'exception
            } catch (EspeceException | SexeException | IllegalStateException e) {
                System.err.println(e.getMessage());
                //traite l'exception
            }
        }
            //ajout de l'animal une fois la vérification effectuée
            ajouter(arrivant);
            //incrémentation de la capacité de l'arche
            capacite++;
            //affichage de l'entrée de l'animal dans l'arche et de la capacité restante
            System.out.printf("L'animal %s est dans l'arche. (capacite %d/8)%n", nomAnimal, capacite);
        }

        /**
         * méthode pour ajouter un animal dans l'arche
         *
         * @param animalAajouter animal qui rentre dans l'arche
         */
        public void ajouter (Animal animalAajouter){
            for (int i = 0; i < animaux.size(); i++) {
                if (animaux.get(i) == null) {
                    animaux.set(i, animalAajouter);
                    break;
                }
            }
        }


    }
