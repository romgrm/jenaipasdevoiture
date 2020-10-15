package fr.romgrm;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    // CREATE INSTANCES/OBJECTS
    static void alimenterVoiture(){
        Voiture Renault = new Voiture("Renault", "Black"); 
        // SYSOUT INSTANCE WITH RETURN FUNCTION "getChaine"
        System.out.println(Renault.getChaine());
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
