package Personne_diplomee;

public class Route extends Case {

    private String sens_de_circulation;
    private Piege piege;

    public Route(int x,int y, String sens) {
        super(x,y);
        this.sens_de_circulation = sens;
        int chance =(int) (Math.random()*100);

        if (chance<5) {
            int type_piege =(int) (Math.random()*2);
            if(type_piege==0) this.piege =new Piege("feu Rouge");
            else if(type_piege==1) this.piege =new Piege("Police");
            else this.piege =new Piege("Nid de poule");

        }
        else this.piege=null;
    }

    public String getSens_de_circulation() {
        return sens_de_circulation;
    }

    public void setSens_de_circulation(String sens_de_circulation) {
        this.sens_de_circulation = sens_de_circulation;
    }

    @Override
    public void effet_Case(Personnage p) {
        if (this.piege!=null){
            if(this.piege.getDescription()=="feu Rouge")
                p.setVie(p.getVie()-1);
            if(this.piege.getDescription()=="Police")
                p.setMorale(p.getMorale()-1);
            if(this.piege.getDescription()=="Nid de poule"){
                p.setHydratation(p.getHydratation()-2);
                p.setSatiete(p.getSatiete()-2);
            }
        }
    }
}
