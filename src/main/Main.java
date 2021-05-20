package main;

import bo.arche.Arche;
import bo.arche.Stock;
import java.util.Scanner;

/**
 * Classe principale utilise les différentes méthodes afin
 * que des animaux selon leur espèce et leur sexe montent sur une arche
 * et qu'on connaisse le stock de nourriture à embarquer.
 * @author Florian Girard
 * @date 20/05/2021
 * @version 1.0
 */
public class Main {
    public static void main(String[] args){
        //création du scanner
        Scanner sc = new Scanner(System.in);
        //création d'une arche
        Arche arche = new Arche();
        //création de la variable qui relancera l'enregistrement
        char again;
        //création et valorisation de la variable pour le nombre de place
        int nbPlaces = 1;
        //création de la boucle d'enregistrement pour la montée des animaux dans l'arche
        //tant que le nombre de place est inférieur à 9 et que la réponde est oui
        do {
            //utilisation de la méthode qui permet l'enregistrement d'un animal arrivant
            arche.arrivant();
            //affichage de la questio si continuer
            System.out.println("Un autre animal veut-il entrer? Pas plus de 8! (O/N)");
            //prise de la réponse
            again = sc.next().toUpperCase().charAt(0);
            //incrémentation du nombre de place
            nbPlaces++;
        }while(again=='O' & nbPlaces<9);

        //remplissage des stock
        int stockPourVegetariens = Stock.stockVegetaux();
        int stockPourCarnivores = Stock.stockViande();

        //message une fois l'arche remplit
        Message.resultatFinale(stockPourVegetariens,stockPourCarnivores);


    }
}
