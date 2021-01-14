package Personne_diplomee;

import java.awt.*;

public class Trottoir extends Case {
    String sens_de_circulation;
    Piege piege;

    public Trottoir(int x,int y, String sens) {
        super(x,y);
        this.sens_de_circulation = sens;
        int chance =(int) (Math.random()*100);

        if (chance<5) {
            int type_piege =(int) (Math.random()*2);
            if(type_piege==0) this.piege =new Piege("peau de banane");
            else if(type_piege==1) this.piege =new Piege("Poussette");
            else this.piege =new Piege("déjéction canine");

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
            if(this.piege.getDescription()=="peau de banane")
                p.setVie(p.getVie()-3);
            if(this.piege.getDescription()=="Poussette")
                p.setMorale(p.getMorale()-2);
            if(this.piege.getDescription()=="déjéction canine"){
                p.setSatiete(p.getSatiete()-1);
            }
        }
    }

    @Override
    public void paint(Graphics g) {

    }
}
