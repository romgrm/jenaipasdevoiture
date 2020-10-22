package fr.romgrm;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

   
    /**
     * @param args The arguments of the program.
     */








    public static void main(String[] args) {
        Agence.creerAgenceNantes();
        creerClientEtReserver(); 
        
    }

    static void creerClientEtReserver(){
        Client clientRiche = new Client("Tonton", "0001");   /*COMPREND PAS*/
        Agence.reserverPremierVehicule(clientRiche);
    }
}