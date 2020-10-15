package fr.romgrm;

////////////////////////////////////////////////////CLASS///////////////////////////////////////////////////////


public class Voiture {
// CREATE FIELDS / PROPRIETES
   String marque; 
   String color; 
   int niveauEssence;
   boolean reservoirVide; 
   boolean reservee; 

/////////////////////////CONSTRUCTOR//////////////////////
   
    public Voiture(String marque, String color){
        this.color = color;
        this.marque = marque; 
   }




///////////////// METHOD : RETURN TEXT POUR LES VOITURES /////////// 
   
    public String getChaine(){
       return "marque : " + this.marque + " " + "color : "+ this.color; 
   }
}
