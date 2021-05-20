package packException;

/**
 * Création d'une exception perso
 * pour lever l'exception qu'il ne peut y avoir qu'un seul animal
 * du même sexe sur l'arche
 */
public class SexeException extends Exception{

    public SexeException(String message){
        super(message);
    }
}
