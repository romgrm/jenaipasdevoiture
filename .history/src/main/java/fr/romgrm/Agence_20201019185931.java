package fr.romgrm;

public class Agence {
    static Agence agenceNantes; //permet d'utiliser l'attribut même en dehors de la class (augmente son scope/ sa portée)
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

// Créer l'agence de Nantes 

static void creerAgenceNantes(){
    agenceDeNantes = new Agence("Agence de Nantes", "Romain"); 
    Adresse adresse = new Adresse("Rue du Taillis", 44000, "Nantes"); 
    agenceNantes.ajouterAdresse(adresse);
}