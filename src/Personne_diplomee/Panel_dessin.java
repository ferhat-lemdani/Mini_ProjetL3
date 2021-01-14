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
            Graphics2D g2 = (Graphics2D) g;
            g2.fill(new Ellipse2D.Double(x,y,40,40));
        }
        Timer t = new Timer(5, this);
        double x=0, y=0, velx=0, vely=0;

        public Panel_dessin(){
            t.start();
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
        }
         public  void actionPerformed(ActionEvent e){
            repaint();
            x+= velx;
            y+=vely;
         }

         public void up(){
            vely=-1.5;
            velx=0;
         }

    public void down(){
        vely=1.5;
        velx=0;
    }
         public void left(){
            vely=-1.5;
            velx=0;
        }

        public void right(){
            vely=1.5;
            velx=0;
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



