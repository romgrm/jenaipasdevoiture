package fr.romgrm;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    // CREATE INSTANCES/OBJECTS
    static void alimenterVoiture(Agence agence){
        Voiture Renault = new Voiture("Renault", "Black"); 
        System.out.println(Renault.getChaine()); // SYSOUT INSTANCE WITH RETURN FUNCTION "getChaine"
        Voiture Peugeot = new Voiture("Peugeot", "Red");
        agence.ajouterVoiture(Renault);
        agence.ajouterVoiture(Peugeot);
        
        
    }   

    static void selectCity(){
        Agence Rennes = new Agence("Rennes");
        System.out.println(Rennes.getChaine());
    }
    
    
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
     
    // RUN WITH MAIN METHOD 
    public static void main(String[] args) {
        alimenterVoiture();
        selectCity();
    }
}
