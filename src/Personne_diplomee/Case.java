package Personne_diplomee;

import java.awt.*;

public abstract class Case {

    int position_x;
    int position_y;

    public Case(int position_x, int position_y){
        this.position_x=position_x;
        this.position_y=position_y;

    }

    public int getPosition_y() {
        return position_y;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }

    public int getPosition_x() {
        return position_x;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public abstract void effet_Case(Personnage p);

    public abstract void paint(Graphics g);
}