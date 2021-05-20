package main;

import animaux.Chat;
import animaux.Chien;
import animaux.Gorille;
import animaux.Lapin;
import enumeration.Espece;
import enumeration.Sexe;
import packException.SaisieException;

import java.util.InputMismatchException;
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
        int valeur;
        while(true) {
            System.out.printf("Quel est ton sexe? %d-%s %d-%s%n", Sexe.MASCULIN.ordinal(), Sexe.MASCULIN, Sexe.FEMININ.ordinal(), Sexe.FEMININ);
            try {
                valeur = sc.nextInt();
                if(valeur != Sexe.MASCULIN.ordinal() & valeur != Sexe.FEMININ.ordinal())
                    throw new SaisieException("La saisie n'est un des choix proposé. Réessaie ou dégage!");
                break;
            } catch (InputMismatchException e) {
                System.err.println("Saisie incorrect. Réessaie...");
            } catch (SaisieException e){
                System.err.println("La saisie n'est un des choix proposé. Réessaie ou dégage!");
            }
            finally {
                sc.nextLine();
            }
        }
        return valeur;
    }

    //demande de l'espèce
    //TODO lecture en tableau
    public static int espece() {
        Scanner sc = new Scanner(System.in);
        int valeur;
        while(true) {
            System.out.printf("Quelle est ton espece? %d-%s %d-%s %d-%s %d-%s%n",
                    Espece.CHAT.ordinal(), Espece.CHAT,
                    Espece.CHIEN.ordinal(), Espece.CHIEN,
                    Espece.GORILLE.ordinal(), Espece.GORILLE,
                    Espece.LAPIN.ordinal(), Espece.LAPIN);
            try {
                valeur = sc.nextInt();
                if(valeur != Espece.CHAT.ordinal() & valeur != Espece.CHIEN.ordinal() & valeur != Espece.GORILLE.ordinal() & valeur != Espece.LAPIN.ordinal())
                    throw new SaisieException("La saisie n'est un des choix proposé. Réessaie ou dégage!");
                break;
            } catch (InputMismatchException e) {
                System.err.println("Saisie incorrect. Réessaie...");
            }catch(SaisieException e){
                System.err.println("La saisie n'est un des choix proposé. Réessaie ou dégage!");
            }
            finally {
                sc.nextLine();
            }
        }
        return valeur;
    }

    public static void resultatFinale(int vegetaux,int viande) {
        System.out.printf("L'arche possède à son bord, %d chat(s), %d chien(s), %d gorille(s), %d lapin(s)%n",
                Chat.getNbchat(), Chien.getNbChien(), Gorille.getNbGorille(), Lapin.getNbLapin());
        System.out.printf("Le commis doit donc avoir, à bord, %d végétaux et %dkg de viande%n",
                vegetaux,viande);
    }
}

