package fr.romgrm;

import java.util.ArrayList;
//CLASS
public class Agence {
    String ville; 
    ArrayList<Voiture> stock; 


//CONSTRUCTOR
    public Agence(String ville){
        this.ville = ville; 
        this.stock = new ArrayList<Voiture>(); // On créer directement le array dans le constructor ?
    }
// AJOUT VOITURE A STOCK
    void ajouterVoitureDansStock(Voiture voiture){
        this.stock.add(voiture); 
    }

// LOOP IN THE STOCK OF CARS 
    void afficherStock(){
        for (Voiture voiture : stock) {
            System.out.println(voiture.getChaine()); 
        }
    }

// RETURN TEXT OF AGENCE    
 String getChaine(){
    return "Agence de " + this.ville; 
 }   

   // CREATE INSTANCES/OBJECTS DE VOITURE
   
   void rentrerDuStock(){ // le fait de mettre en paramètre "Agence" permet de lier les voitures au stock
   Voiture Renault = new Voiture("Renault", "Black"); 
   //System.out.println(Renault.getChaine()); // SYSOUT INSTANCE WITH RETURN FUNCTION "getChaine"
   Voiture Peugeot = new Voiture("Peugeot", "Red");
   
   // AJOUT DES INSTANCES A MON STOCK
   this.ajouterVoitureDansStock(Renault);
   this.ajouterVoitureDansStock(Peugeot);
   
   
}  
}
