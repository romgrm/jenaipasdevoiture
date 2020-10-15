package fr.romgrm;

/*

- On execute dans ce fichier car c'est là ou il y'a la méthode main, qui va permettre d'afficher dans la console
- Une seule class par fichier, si on veut créer une autre class on créér un autre fichier 

*/


////////////////////////////////////////////////////CLASS///////////////////////////////////////////////////////

/* "final" signifie que ma class "App" ne peut être étendue (pas d'héritage). Le mot "final" est aussi utilisé
pour des fonctions / variables constantes (final = const)*/


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
     
    /////////////////////////METHOD MAIN : EXECUTE LE CODE ////////////////////// 
    /*public static void main(String[] args) {
        //Agence Rennes = new Agence("Rennes"); // agence créée direct dans la main ? // la créer dans une method
        System.out.println(Rennes.getChaine());
        Rennes.rentrerDuStock();
        //selectCity();
        Rennes.afficherStock(); 
    }*/

    public static void main(String[] args) {
        Agence Rennes = new Agence("Rennes");
        Rennes.getChaine(); 
        Rennes.afficherStock();
    }
    
}
