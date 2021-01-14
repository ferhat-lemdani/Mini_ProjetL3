package Personne_diplomee;

public class Homme_presse extends Personnage{
    public Homme_presse(String pseudo,int positionX,int positionY){
        super(100, false, 75, 75, 50, pseudo, 0, false, false, positionX, positionY, "a pied", 0, 0,0,0);
    }

    @Override
    public void effet_action() {

    }
}
