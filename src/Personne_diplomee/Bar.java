package Personne_diplomee;

import java.awt.*;

public class Bar extends Batiment {

    public Bar(int x, int y,int surface, String couleur, int nombre_de_pieces){
        super(x,y,surface,couleur,nombre_de_pieces);
    }


    @Override
    public void effet_Case(Personnage p) {
        int chance =(int) (Math.random()*100);
        if(chance<5) p.setChance_diplome(p.getChance_diplome()+5);
        p.setVie(p.getVie()-3);
        p.setMorale(p.getMorale()+10);
        p.setHydratation(p.getHydratation()+25);

    }

    @Override
    public void paint(Graphics g) {

    }
}