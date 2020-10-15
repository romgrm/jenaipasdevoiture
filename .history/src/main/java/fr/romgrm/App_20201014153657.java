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
        System.out.println(Renault.getChaine());
    }   
    
    
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
     
    // RUN WITH MAIN METHOD 
    public static void main(String[] args) {
        System.out.println("Hello World!");
        alimenterVoiture();
    }
}
