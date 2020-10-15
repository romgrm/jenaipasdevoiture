package fr.romgrm;

/**
 * Hello world!
 */
public final class App {
    private App() {
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
        Agence Rennes = new Agence("Rennes"); // agence créée direct dans la main ? 
        System.out.println(Rennes.getChaine());
        Rennes.rentrerDuStock();
        //selectCity();
        Rennes.afficherStock(); 
    }
}
