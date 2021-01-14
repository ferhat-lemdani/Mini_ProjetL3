package Personne_diplomee;

import java.awt.*;

public class Foret extends Case {
    public Foret(int position_x, int position_y) {
        super(position_x, position_y);
    }

    @Override
    public void effet_Case(Personnage p) {
        int chance =(int) (Math.random()*100);
        if (chance<10) p.setMalade(true);
    }

    @Override
    public void paint(Graphics g) {

    }
}
