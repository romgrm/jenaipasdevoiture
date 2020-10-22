package fr.romgrm;

import java.util.ArrayList;

public class Agence {
    static Agence agenceNantes; //permet d'utiliser l'attribut même en dehors de la class (augmente son scope/ sa portée)
    String nom; 
    String nomDuCommercial; 
    Adresse adresse; 
    ArrayList<Vehicule> stockDeVehicules; // on créer un tableau qui sera un stock de vehicules, de la class Vehicule


    Agence(String nom, String nomDuCommercial){
        this.nom= nom; 
        this.nomDuCommercial = nomDuCommercial; 
        this.stockDeVehicules = new ArrayList<Vehicule>; // on initilise le tableau 
    }

    //Ajouter une adresse à l'agence en recuperant la class Adresse

    void ajouterAdresse(Adresse adresse){
        this.adresse = adresse; 
    }

    // Afficher notre agence 
    public String toString(){ 
        return "Localisation agence : " + this.nom + " Commercial : " + this.nomDuCommercial; /*QUESTIONS*/ 
    }

    // Créer l'agence de Nantes 

    static void creerAgenceNantes(){
        agenceNantes = new Agence("Agence de Nantes", "Romain"); 
        Adresse adresse = new Adresse("Rue du Taillis", 44000, "Nantes"); 
        agenceNantes.ajouterAdresse(adresse);
        System.out.println(agenceNantes); /*QUESTION*/ 
    }
}