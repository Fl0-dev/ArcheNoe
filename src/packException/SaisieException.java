package packException;

/**
 * Création d'une exception perso
 * pour lever l'exception qu'il ne peut y avoir que deux animaux
 * de la même espèce
 */
public class SaisieException extends Exception{

    public SaisieException(String message){
        super(message);
    }

}
