package fr.romgrm;


/*

- Ici on va retrouver la création de nos différentes agences 

*/

import java.util.ArrayList;


////////////////////////////////////////////////////CLASS///////////////////////////////////////////////////////
public class Agence {
    String ville; 
    ArrayList<Voiture> stock; 

/////////////////////////CONSTRUCTOR//////////////////////

    public Agence(String ville){
        this.ville = ville; 
        this.stock = new ArrayList<Voiture>(); // On créer directement le array dans le constructor ?
    }
///////////////////////// METHOD : AJOUT VOITURE A STOCK//////////////////////// 
    
    /* on récupère la class voiture en la mettant en paramètre de notre method afin de pouvoir ajouter 
    les voitures dans le stock
    */
    void ajouterVoitureDansStock(Voiture voiture){ 
        this.stock.add(voiture); 
    }

///////////////////////// METHOD : BOUCLE SUR STOCK/////////

/* on créer une method qui  va faire une boucle (foreach) afin de voir l'état de nos stocks de voiture.
Le sysout permet de voir les voitures présentes dans le stock */
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
