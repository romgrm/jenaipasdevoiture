package fr.romgrm;

public class Vehicule {
    String marque;
    String couleur; 
    int niveauEssence; 
    int energieMax; 
    boolean disponible; 

    Vehicule(String marque, String couleur, int energieMax){
        this.marque = marque; 
        this.couleur = couleur; 
        this.energieMax = energieMax; 
    }
}
