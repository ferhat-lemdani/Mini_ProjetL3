package Personne_diplomee;

public class Standard extends Personnage{
    public Standard(String pseudo,int positionX,int positionY){
        super(75, false, 75, 75, 75, pseudo, 0, false, false, positionX, positionY, "a pied", 0, 0);
    }

    @Override
    public void effet_action() {
        this.setVie(this.getVie()-1);
    }
}
