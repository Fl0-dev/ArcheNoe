package main;

import bo.arche.*;
import enumeration.Espece;
import enumeration.Sexe;

import java.util.Scanner;

/**
 * Classe regroupant toutes les méthodes d'affichage des menus
 */

public class Message {

    //demande du nom
    public static String nom() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est ton nom?");
        return sc.nextLine();
    }

    //demande du sexe
    //TODO lecture en tableau
    public static int sexe() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quel est ton sexe? %d-%s %d-%s%n", Sexe.MASCULIN.ordinal(), Sexe.MASCULIN, Sexe.FEMININ.ordinal(), Sexe.FEMININ);
        return sc.nextInt();
    }

    //demande de l'espèce
    //TODO lecture en tableau
    public static int espece() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quelle est ton espece? %d-%s %d-%s %d-%s %d-%s%n",
                Espece.CHAT.ordinal(), Espece.CHAT,
                Espece.CHIEN.ordinal(), Espece.CHIEN,
                Espece.GORILLE.ordinal(), Espece.GORILLE,
                Espece.LAPIN.ordinal(), Espece.LAPIN);
        return sc.nextInt();
    }

    public static void resultatFinale() {
        System.out.printf("L'arche possède à son bord, %d chat(s), %d chien(s), %d gorille(s), %d lapin(s)",
                Chat.getNbchat(),Chien.getNbChien(),Gorille.getNbGorille(),Lapin.getNbLapin());
    }


    //demande si nouvel enregistrement

}

