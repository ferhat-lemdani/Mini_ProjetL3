package Personne_diplomee;

public class Ville {
    private int n;
    private int m;
    private String nom;

    private Case[][] cases;
    public Ville(int n, int m,String nom){
        this.nom=nom;
        this.n=n;
        this.m=m;
        this.cases=new Case[n][m];

    }
    public Case obtenir_case(int x, int y){

        return cases[x][y];
    }
    public void modifier_case(int x,int y, Case c) {

        this.cases[x][y] = c;
    }


}