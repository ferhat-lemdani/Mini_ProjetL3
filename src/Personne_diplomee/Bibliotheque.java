package Personne_diplomee;

public class Bibliotheque extends Batiment {

    public Bibliotheque(int x, int y, int surface, String couleur, int nombre_de_pieces ){
        super(x,y,surface,couleur,nombre_de_pieces);
    }


    @Override
    public void effet_Case(Personnage p) {
        int chance =(int) (Math.random()*100);
        p.setMorale(p.getMorale()+20);
        if (chance<5) p.setChance_diplome(p.getChance_diplome()+10);
    }
}