package Personne_diplomee;

import java.awt.*;

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

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(this.position_x,this.position_y,50,50);
    }
}