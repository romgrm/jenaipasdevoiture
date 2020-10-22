package fr.romgrm;

public class Voiture extends Vehicule{
    String typeCarburant;
    int kilometrage; 
    int nbPlaces; 

    Voiture (String typeCarburant, int kilometrages, int nbPlaces){
        super(marque, couleur, energieMax) //on recupere les attributs de la class parent Vehicule
        this.typeCarburant = typeCarburant; 
        this.kilometrage = kilometrages; 
        this.nbPlaces = nbPlaces; 
    }
}
