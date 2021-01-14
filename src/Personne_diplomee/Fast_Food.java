package Personne_diplomee;

public class Fast_Food extends Batiment {

    public Fast_Food(int x, int y,int surface, String couleur, int nombre_de_pieces){
        super(x,y,surface,couleur,nombre_de_pieces);
    }

    @Override
    public void effet_Case(Personnage p) {
        p.setSatiete(p.getSatiete()+25);
        p.setMorale(p.getMorale()+10);
        p.setHydratation(p.getHydratation()+10);
        p.setVie(p.getVie()-5);
    }
}