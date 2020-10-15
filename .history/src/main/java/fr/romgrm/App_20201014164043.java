package fr.romgrm;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    // CREATE INSTANCES/OBJECTS DE VOITURE
    
    static void alimenterVoiture(Agence agence){ // le fait de mettre en paramètre "Agence" permet de lier les voitures au stock
        Voiture Renault = new Voiture("Renault", "Black"); 
        //System.out.println(Renault.getChaine()); // SYSOUT INSTANCE WITH RETURN FUNCTION "getChaine"
        Voiture Peugeot = new Voiture("Peugeot", "Red");
        
        // AJOUT DES INSTANCES A MON STOCK
        agence.ajouterVoiture(Renault);
        agence.ajouterVoiture(Peugeot);
        
        
    }   

    /*static void selectCity(){
        Agence Rennes = new Agence("Rennes");
        //System.out.println(Rennes.getChaine());
    }*/
    
    
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
     
    // RUN/EXECUTE WITH MAIN METHOD 
    public static void main(String[] args) {
        Agence Rennes = new Agence("Rennes");
        System.out.println(Rennes.getChaine());
        alimenterVoiture(Rennes);
        //selectCity();
        Rennes.afficherStock(); 
    }
}
