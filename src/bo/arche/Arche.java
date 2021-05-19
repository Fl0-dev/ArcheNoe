package bo.arche;

import enumeration.Espece;
import enumeration.Sexe;
import main.Message;

/**
 * Classe Arche
 * qui regroupe 8 animaux maximum
 * dans un tableau en attribut
 */
public class Arche {
    Animal[] animaux = new Animal[8];

    public Arche() {
    }
    public Animal[] getAnimaux() {
        return animaux;
    }
    public void arrivant(){
        String nomAnimal = Message.nom();
        int sexe = Message.sexe();
        int espece = Message.espece();
        System.out.printf("L'animal %s est dans l'arche%n",nomAnimal);
        switch(espece){
            case 0:
                if(sexe == 0) {
                    Chat arrivant = new Chat(Sexe.MASCULIN,Espece.CHAT);
                    ajouter(arrivant);
                }else{
                    Chat arrivant = new Chat(Sexe.FEMININ,Espece.CHAT);
                    ajouter(arrivant);
                }
                break;
            case 1 : if(sexe == 0) {
                Chien arrivant = new Chien(Sexe.MASCULIN,Espece.CHIEN);
                ajouter(arrivant);
            }else{
                Chien arrivant = new Chien(Sexe.FEMININ, Espece.CHIEN);
                ajouter(arrivant);
            }
                break;
            case 2 :
                if(sexe == 0) {
                    Gorille arrivant = new Gorille(Sexe.MASCULIN,Espece.GORILLE);
                    ajouter(arrivant);
                }else{
                    Gorille arrivant = new Gorille(Sexe.FEMININ,Espece.GORILLE);
                    ajouter(arrivant);
                }break;
            case 3 :
                if(sexe == 0) {
                    Lapin arrivant = new Lapin(Sexe.MASCULIN,Espece.LAPIN);
                    ajouter(arrivant);
                }else{
                    Lapin arrivant = new Lapin(Sexe.FEMININ,Espece.LAPIN);
                    ajouter(arrivant);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + espece);
        }
    }
    /**
     * @param animalAajouter animal qui rentre dans l'arche
     */
    public void ajouter(Animal animalAajouter) {
        for (int i = 0; i < animaux.length; i++) {
            if (animaux[i] == null) {
                animaux[i] = animalAajouter;
                break;
            }
        }
    }
}
