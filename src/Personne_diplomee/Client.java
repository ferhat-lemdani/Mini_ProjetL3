package Personne_diplomee;

import javax.swing.JFrame;

public class Client {


    public static void main(String[] args){
        //Ville ville =new Ville(10,10,"ville1");
        //Gui gui =new Gui("Mon_interface", ville);

        JFrame f = new JFrame();
        Panel_dessin s = new Panel_dessin();
        f.add(s);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,600);

    }

}
