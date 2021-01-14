package Personne_diplomee;

import java.awt.*;

public class Case_Grisee extends Case{


    public Case_Grisee(int position_x, int position_y) {
        super(position_x, position_y);
    }

    @Override
    public void effet_Case(Personnage p) {

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(this.position_x,this.position_y,50,50);

    }
}
