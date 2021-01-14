package Personne_diplomee;

public class Maison extends Batiment {

    public Maison(int x, int y, int surface,String couleur, int nombre_de_pieces){

        super(x,y,surface,couleur,nombre_de_pieces);
    }


    @Override
    public void effet_Case(Personnage p) {
        p.setMorale(p.getMorale()+10);
        p.setSatiete(p.getSatiete()+10);
        p.setHydratation(p.getHydratation()+10);
    }
}