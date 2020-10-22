package fr.romgrm;

public class Voiture extends Vehicule{
    String typeEnergie;
    int nivEnergie; 
    int kilometrage; 
    int nbPlaces; 

    Voiture (String marque, String couleur, int nbPlaces, String typeEnergie, int energieMax){
        super(marque, couleur, energieMax); //on recupere les attributs de la class parent Vehicule
        this.typeEnergie = typeEnergie; 
        this.nbPlaces = nbPlaces;
        this.nivEnergie = 0; 
        this.kilometrage = 0;  
    }

    public String toString(){
        return "Voiture : " + this.marque + " / " + "Couleur : " + this.couleur + " / " + (this.disponible?"oui":"non"); 
    }
}
