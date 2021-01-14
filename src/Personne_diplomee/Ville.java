package Personne_diplomee;

import java.awt.*;
import java.awt.Graphics;

public class Ville {
    private int n;
    private int m;
    private String nom;
    public Personnage p;

    private Case[][] cases;

    public Personnage getP() {
        return p;
    }

    public void setP(Personnage p) {
        this.p = p;
    }

    public Case[][] getCases() {
        return cases;
    }

    public void setCases(Case[][] cases) {
        this.cases = cases;
    }

    public Ville(int n, int m, String nom, Personnage p){
        this.cases=new Case[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
           this.cases[i][j]=new Case_Grisee(50*i,50*j);
               }
            }
        this.nom=nom;
        this.n=n;
        this.m=m;
        this.p=p;
        this.cases[0][0]=new Maison(0,0,0,"jaune",0);
    }

    public Case obtenir_case(int x, int y){

        return cases[x][y];
    }
    public void modifier_case(int x,int y, Case c) {

        this.cases[x][y] = c;
    }
    public void paint(Graphics g){
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                cases[i][j].paint(g);
            this.p.paint(g);

    }

}