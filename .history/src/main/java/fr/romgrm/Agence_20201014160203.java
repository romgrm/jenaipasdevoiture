package fr.romgrm;

public class Agence {
    String ville; 

    public Agence(String ville){
        this.ville = ville; 
    }

    
 String getChaine(){
    return "Agence de " + this.ville; 
 }   
}
