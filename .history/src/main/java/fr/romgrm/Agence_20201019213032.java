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
        this.stockDeVehicules = new ArrayList<Vehicule>(); // on initilise le tableau 
    }

    //Ajouter une adresse à l'agence en recuperant la class Adresse

    void ajouterAdresse(Adresse adresse){
        this.adresse = adresse; 
    }

    // Ajouter un vehicule au stock véhicule de l'agence

    void ajouterVehicule(Vehicule vehicule){
        this.stockDeVehicules.add(vehicule);  
    }

    void afficherStock(){
        System.out.println("Stock :");
        for (Vehicule vehicule : stockDeVehicules) {
            System.out.println(vehicule);
            vehicule.disponible = true;                 /*QUESTIONS*/
        }
    }

    // Afficher notre agence 
    public String toString(){ 
        return "Localisation agence : " + this.nom + " Commercial : " + this.nomDuCommercial; /*QUESTIONS*/ 
    }

    

    static void creerAgenceNantes(){

        // Créer l'agence de Nantes  et lui ajouter son adresse

        agenceNantes = new Agence("Agence de Nantes", "Romain"); 
        Adresse adresse = new Adresse("Rue du Taillis", 44000, "Nantes"); 
        agenceNantes.ajouterAdresse(adresse);
        System.out.println(agenceNantes); /*QUESTION*/ 

        // Créer 2 voitures et les ajouter au stock
        Voiture petitPrix = new Voiture("Dacia"; "blanche", 5, "diesel", 50);
        Voiture grosPrix = new Voiture("Audi", "Rouge", 4, "essence", 70); 
        agenceNantes.ajouterVehicule(petitPrix); //on ajoute voiture "petitPrix", au stock véhicule, de l'agence de Nantes
        agenceNantes.ajouterVehicule(grosPrix);
        System.out.println(grosPrix);

        // Afficher le stock de véhicules
        agenceNantes.afficherStock();
    }
}