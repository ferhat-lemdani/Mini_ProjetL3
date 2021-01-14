package Personne_diplomee;

import javax.swing.JFrame;

public class Client {


    public static void main(String[] args){
        Hippie hippie = new Hippie("ferhat",0,0);
        Ville ville =new Ville(10,10,"ville1",hippie);
        //Gui gui =new Gui("Mon_interface", ville);

        JFrame f = new JFrame();
        Panel_dessin s = new Panel_dessin(ville);
        f.add(s);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,600);

    }

}
