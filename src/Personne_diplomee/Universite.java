package Personne_diplomee;

import java.awt.*;

public class Universite extends Batiment {

    public Universite(int x, int y, int surface, String couleur, int nombre_de_pieces){
        super(x,y,surface,couleur,nombre_de_pieces);
    }
    public void obtenir_diplome(Personnage p){
    }

    @Override
    public void effet_Case(Personnage p) {
        int chance =(int) (Math.random()*100);
        if (chance<30+p.getChance_diplome()){
            p.setNombre_diplome(p.getNombre_diplome()+1);
            p.setMorale(p.getMorale()+5);
        }
    }

    @Override
    public void paint(Graphics g) {

    }
}