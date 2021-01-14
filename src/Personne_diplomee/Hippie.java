package Personne_diplomee;

public class Hippie extends Personnage{
    public Hippie(String pseudo,int positionX,int positionY){
        super(75, false, 50, 50, 100, pseudo, 0, false, false, positionX, positionY, "a pied", 0, 0);
    }

    @Override
    public void effet_action() {
        this.setVie(this.getVie()-2);
    }
}
