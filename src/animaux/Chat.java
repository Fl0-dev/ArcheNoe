package animaux;

import enumeration.Espece;
import enumeration.Sexe;

/**
 * classe chat
 */
public class Chat extends Animal implements Carnivore {
    private static int nbChat =0;

    public Chat(Sexe sexe, Espece espece) {
        super(sexe, espece);
        nbChat++;
    }

    public static int getNbchat() {
        return nbChat;
    }
}
