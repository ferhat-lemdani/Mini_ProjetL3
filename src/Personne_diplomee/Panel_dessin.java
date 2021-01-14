package Personne_diplomee;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
public class Panel_dessin extends JPanel implements ActionListener, KeyListener {


    Ville ville;

    /*public JPanel affiche(){
            this.setBounds(0,0,500,500);
            this.setBackground(new Color(255, 255, 255));
            return this;
        }
*/
        public  void paintComponent(Graphics g) {
            super.paintComponent(g);
            //g.setColor(Color.RED);
          //  g.drawRect(10,10,200,200);
           ville.paint(g);
        }
        Timer t = new Timer(5, this);


        public Panel_dessin(Ville ville){
            this.ville=ville;
            t.start();
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
            setSize(500,500);
        }
         public  void actionPerformed(ActionEvent e){
            repaint();

         }


         public void up(){


             if (this.ville.p.getYcase()>0) {
                        System.out.println("iffagh");
                 Case future_case = this.ville.getCases()[this.ville.p.getXcase()][this.ville.p.getYcase() - 1];


                 if (future_case.getClass().getName() == "case_Grisee") {
                     System.out.println("Can't move it's darkness");
                 } else {
                     this.ville.p.se_deplacer(this.ville, Direction.Haut);

                     future_case.effet_Case(this.ville.p);
                 }
             }
         }

    public void down(){
        if (this.ville.p.getYcase()<9) {

            Case future_case = this.ville.getCases()[this.ville.p.getXcase()][this.ville.p.getYcase() + 1];


            if (future_case.getClass().getName() == "case_Grisee") {
                System.out.println("Can't move it's darkness");
            } else {
                this.ville.p.se_deplacer(this.ville, Direction.Bas);

                future_case.effet_Case(this.ville.p);
            }
        }

    }
         public void left(){
             if (this.ville.p.getXcase()>0) {

                 Case future_case = this.ville.getCases()[this.ville.p.getXcase()-1][this.ville.p.getYcase() ];


                 if (future_case.getClass().getName() == "case_Grisee") {
                     System.out.println("Can't move it's darkness");
                 } else {
                     this.ville.p.se_deplacer(this.ville, Direction.Gauche);

                     future_case.effet_Case(this.ville.p);
                 }
             }
        }

        public void right(){
            if (this.ville.p.getXcase()<9) {

                Case future_case = this.ville.getCases()[this.ville.p.getXcase()+1][this.ville.p.getYcase() ];


                if (future_case.getClass().getName() == "case_Grisee") {
                    System.out.println("Can't move it's darkness");
                } else {
                    this.ville.p.se_deplacer(this.ville, Direction.Droite);

                    future_case.effet_Case(this.ville.p);
                }
            }
        }




    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
            up();
        }
        if (code == KeyEvent.VK_DOWN){
            down();
        }
        if (code == KeyEvent.VK_RIGHT){
            right();
        }
        if (code == KeyEvent.VK_LEFT){
            left();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}



