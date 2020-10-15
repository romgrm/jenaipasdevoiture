package fr.romgrm;

import java.util.ArrayList;
//CLASS
public class Agence {
    String ville; 
    ArrayList<Voiture> stock; 


//CONSTRUCTOR
    public Agence(String ville){
        this.ville = ville; 
        this.stock = new ArrayList<Voiture>(); 
    }
// AJOUT VOITURE A STOCK
    void ajouterVoiture(Voiture voiture){
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
}
