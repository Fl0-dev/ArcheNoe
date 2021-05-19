package main;

import bo.arche.Arche;
import bo.arche.Stock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arche arche = new Arche();
        char again = 'O';
        int nbPlaces = 1;
        do {
            arche.arrivant();
            System.out.println("Un autre animal veut-il entrer? Pas plus de 8! (O/N)");
            again = sc.next().toUpperCase().charAt(0);

            nbPlaces++;
        }while(again=='O' & nbPlaces<9);

        //remplissage des stock
        int stockPourVegetariens = Stock.stockVegetaux();
        int stockPourCarnivores = Stock.stockViande();

        //message une fois l'arche remplit
        Message.resultatFinale(stockPourVegetariens,stockPourCarnivores);


    }
}
