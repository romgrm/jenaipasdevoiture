package fr.romgrm;

public class Agence {
    String nom; 
    String nomDuCommercial; 
    Adresse adresse; 
}

Agence(String nom, String nomDuCommercial){
    this.nom= nom; 
    this.nomDuCommercial = nomDuCommercial; 

}

//Ajouter une adresse à l'agence en recuperant la class Adresse

void ajouterAdresse(Adresse adresse){
    this.adresse = adresse; 
}