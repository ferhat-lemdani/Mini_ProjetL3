package Personne_diplomee;

public abstract class Batiment extends Case {
    private int surface;
    private String couleur;
    private int nombre_de_pieces;

    public int getNombre_de_pieces() {
        return nombre_de_pieces;
    }

    public void setNombre_de_pieces(int nombre_de_pieces) {
        this.nombre_de_pieces = nombre_de_pieces;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public Batiment(int x,int y,int surface, String couleur, int nombre_de_pieces) {
        super(x,y);
        this.surface = surface;
        this.couleur = couleur;
        this.nombre_de_pieces = nombre_de_pieces;

    }


}
