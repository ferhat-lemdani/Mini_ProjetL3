package Personne_diplomee;

public abstract class Personnage {


    private  int vie;
    private boolean malade;
    private int hydratation;
    private int satiete;
    private int morale;
    private String pseudo;
    private int nombre_diplome;
    private boolean maillot_de_bain;
    private boolean permis_de_conduire;
    private int positionX;
    private int positionY;
    private String moyen_de_deplacement;
    private int nombre_arrestations;

    public Personnage(int vie, boolean malade, int hydratation, int satiete, int morale, String pseudo, int nombre_diplome, boolean maillot_de_bain, boolean permis_de_conduire, int positionX, int positionY, String moyen_de_deplacement, int nombre_arrestations, int chance_diplome) {
        this.vie = vie;
        this.malade = malade;
        this.hydratation = hydratation;
        this.satiete = satiete;
        this.morale = morale;
        this.pseudo = pseudo;
        this.nombre_diplome = nombre_diplome;
        this.maillot_de_bain = maillot_de_bain;
        this.permis_de_conduire = permis_de_conduire;
        this.positionX = positionX;
        this.positionY = positionY;
        this.moyen_de_deplacement = moyen_de_deplacement;
        this.nombre_arrestations = nombre_arrestations;
        this.chance_diplome = chance_diplome;
    }

    public int getChance_diplome() {
        return chance_diplome;
    }

    public void setChance_diplome(int chance_diplome) {
        this.chance_diplome = chance_diplome;
    }

    private int chance_diplome;


    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public boolean isMalade() {
        return malade;
    }

    public void setMalade(boolean malade) {
        this.malade = malade;
    }

    public int getHydratation() {
        return hydratation;
    }

    public void setHydratation(int hydratation) {
        this.hydratation = hydratation;
    }

    public int getSatiete() {
        return satiete;
    }

    public void setSatiete(int satiete) {
        this.satiete = satiete;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getNombre_diplome() {
        return nombre_diplome;
    }

    public void setNombre_diplome(int nombre_diplome) {
        this.nombre_diplome = nombre_diplome;
    }

    public boolean isMaillot_de_bain() {
        return maillot_de_bain;
    }

    public void setMaillot_de_bain(boolean maillot_de_bain) {
        this.maillot_de_bain = maillot_de_bain;
    }

    public boolean isPermis_de_conduire() {
        return permis_de_conduire;
    }

    public void setPermis_de_conduire(boolean permis_de_conduire) {
        this.permis_de_conduire = permis_de_conduire;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getMoyen_de_deplacement() {
        return moyen_de_deplacement;
    }

    public void setMoyen_de_deplacement(String moyen_de_deplacement) {
        this.moyen_de_deplacement = moyen_de_deplacement;
    }

    public void manger(int nombre){}

    public void boire(int nombre){}
    public void se_soigner(){}

    public int getNombre_arrestations() {
        return nombre_arrestations;
    }

    public void setNombre_arrestations(int nombre_arrestations) {
        this.nombre_arrestations = nombre_arrestations;
    }

    public void se_deplacer(Ville ville1, Direction d){
        effet_action();
        int chance =(int)(Math.random()*100); //recuperer pourcentage de chance

        if (d==Direction.Haut) this.setPositionY(this.getPositionY()-1);
        else if (d==Direction.Bas) this.setPositionY(this.getPositionY()+1);
        else if (d==Direction.Gauche) this.setPositionX(this.getPositionX()-1);
        else if (d==Direction.Droite) this.setPositionX(this.getPositionX()+1);

        if (this.getMoyen_de_deplacement()=="en voiture"){
            if (chance<2) setVie(0);
            setMorale(getMorale()-2);
            setNombre_arrestations(getNombre_arrestations()+1);


        }
        else if (this.getMoyen_de_deplacement()=="a pied"){
            setHydratation(getHydratation()-10);
            setSatiete(getSatiete()-10);
        }
        else if (this.getMoyen_de_deplacement()=="a velo"){
            if(chance<1) setVie(0);
            setHydratation(getHydratation()-5);
            setSatiete(getSatiete()-5);
        }
    }
    public abstract void effet_action();

}
