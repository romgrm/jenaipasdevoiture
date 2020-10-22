package fr.romgrm;

public class Voiture extends Vehicule{
    String typeEnergie;
    int kilometrage; 
    int nbPlaces; 

    Voiture (String typeEnergie, int kilometrages, int nbPlaces){
        super(marque, couleur, energieMax) //on recupere les attributs de la class parent Vehicule
        this.typeEnergie = typeEnergie; 
        this.kilometrage = kilometrages; 
        this.nbPlaces = nbPlaces; 
    }
}
