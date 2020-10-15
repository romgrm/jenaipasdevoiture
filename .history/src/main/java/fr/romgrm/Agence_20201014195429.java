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




///////////////////////// METHOD : AJOUT CLASS VOITURE A STOCK//////////////////////// 
    
    /* on récupère la class voiture (créée dans Voiture.java) en la mettant en paramètre de notre method pour 
    pouvoir l'appeler, puis pouvoir l'ajouter à notre stock */

    void ajouterVoitureDansStock(Voiture voiture){ 
        this.stock.add(voiture); 
    }

    /*QUESTIONS : pq ajouter la class "voiture" au stock sachant qu'on ajoute après les instances (voitures
    créées au stock (cf bas de code))*/



///////////////////////// METHOD : BOUCLE SUR STOCK/////////

/* on créer une method qui  va faire une boucle (foreach) afin de voir l'état de nos stocks de voiture.
Le sysout permet de voir les voitures présentes dans le stock et pour chq items d'afficher le voiture.getChaine
(donc la marque + color) */
    void afficherStock(){
        for (Voiture voiture : stock) {
            System.out.println(voiture.getChaine()); 
        }
    }





///////////////// METHOD : RETURN TEXT POUR LES AGENCES ///////////

/* on créer une method en String qui va nous return un text + l'instance/objet ville */
 String getChaine(){
    return "Agence de " + this.ville; 
 }   






 /////// METHOD : CREATION DES INSTANCES/OBJECTS VOITURE //////// 
   
 /*
 - On créer des nouvelles instances de la Class Voiture (on peut le faire vu qu'on est en public)
 - On ajoute les instances créées (nos voitures), au stock grâce à la fonction "ajouterVoitureDansStock" (qui 
 elle même ajoute la class à Stock), dans nos agences (this fait référence à l'objet donc à notre agence)

 */
   void rentrerDuStock(){ 
   Voiture Renault = new Voiture("Renault", "Black"); 
   Voiture Peugeot = new Voiture("Peugeot", "Red");
   
   // AJOUT DES INSTANCES A MON STOCK
   this.ajouterVoitureDansStock(Renault);
   this.ajouterVoitureDansStock(Peugeot);
   
   
}  

////////////////////////////////////////////////////// MAIN ////////////////////////////////////////////////////
public static void main(String[] args) {
    
    // CREATION DES AGENCES
    Agence Rennes = new Agence("Rennes");
    Agence Nantes = new Agence("Nantes"); 
    Agence Brest = new Agence("Brest"); 


    System.out.println(Rennes.getChaine());
    System.out.println(Nantes.getChaine());
    System.out.println(Brest.getChaine());
    Rennes.getChaine()
    Rennes.afficherStock();    
}



}
