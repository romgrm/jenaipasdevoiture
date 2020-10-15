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
   
    public Voiture(String marque, String color, int nombreKilometres){
        this.color = color;
        this.marque = marque; 
        this.nombreKilometres = nombreKilometres; 
   }




///////////////// METHOD : RETURN TEXT POUR LES VOITURES /////////// 
   
    public String getChaine(){
       return "Marque de la voiture : " + this.marque + " ." + 
       "Couleur de la voiture : " + this.color + " ." + 
       "Nombre de kilomètres de la voiture : " + this.nombreKilometres + " ."; 
   }
}
