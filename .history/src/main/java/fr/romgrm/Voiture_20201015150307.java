package fr.romgrm;

////////////////////////////////////////////////////CLASS///////////////////////////////////////////////////////


public class Voiture {
// CREATE FIELDS / PROPRIETES
   String marque; 
   String color; 
   int nombreKilometres;
   int niveauEssence;
   boolean reservoirVide; 
   boolean reservee; 

/////////////////////////CONSTRUCTOR//////////////////////
   
    public Voiture(String marque, String color, int nombreKilometres, int niveauEssence){
        this.color = color;
        this.marque = marque; 
        this.nombreKilometres = nombreKilometres; 
        this.niveauEssence = niveauEssence; 
   }




///////////////// METHOD : RETURN TEXT POUR LES VOITURES /////////// 
   
    public String getChaine(){
       return "Marque de la voiture : " + this.marque + " . " + 
       "Couleur de la voiture : " + this.color + " . " + 
       "Nombre de kilomètres de la voiture : " + this.nombreKilometres + " . "; 
   }
}

public String getNiveauEssence(){
   return "faites le plein !"; 
}
