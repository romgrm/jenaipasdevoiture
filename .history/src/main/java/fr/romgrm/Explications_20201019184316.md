### EXPLICATIONS

## START

On commence par créer un fichier pour chaque class : 

- Un fichier Agence
- Un fichier Véhicules
- Un fichier Voiture
- Un fichier Vélo
- Un fichier client

etc.... 

L'intérêt est de pouvoir avoir accès à chacun de nos attributs de nos class dans leur propre fichier
pour que ça soit plus simple de travailler avec. 

## Fichiers parents/enfants -> HERITAGE

On parle d'héritage quand une class reprend les infos d'une autre class. Cette dernière est donc la
class parent, et la class qui reprend ses infos est la class enfant.

On créer un héritage en ajoutant "extends" à la class enfant 

/* EXEMPLE */

Ici on sait que la class **Voiture** et la class **Vélo** sont des class **enfants** de la class parent
**Véhicules**. 

On peut donc récupérer les infos de *Véhicules* en utilisant le mot **super** dans une method, le
but étant d'avoir directement les attributs de la class parente, dans la class enfant. 

/* EXEMPLE */

## RELIER LES CLASS ENTRE-ELLES

Pour pouvoir créer certaines méthods, on va devoir récupérer les informations d'une class dans une autre
Pour ça on va tout simplement créer un attribut qui va reprendre le nom de notre class voulue, dans
la class que l'on souhaite utiliser. 

    public class Agence { 
        String nom; 
        String nomDuCommercial; 
        Adresse adresse; 
    }

On est dans la class **Agence** et on a besoin de récupérer la class **Adresse** afin de donner/créer
une adresse pour notre nouvelle agence. 


/* EXEMPLE */

## EXECUTION

Le fichier **App.java** est là ou l'on va retrouver notre **Main Method** donc c'est là ou on va 
executer notre code pour la console.  