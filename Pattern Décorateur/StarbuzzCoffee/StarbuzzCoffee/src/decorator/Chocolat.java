package decorator;

import composants.Boisson;

public class Chocolat extends DecoratorAbstract {

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescripton(){
        return  boisson.getDescription()+"au Chocolat";
    }


    @Override
    public double cout() {

        return 1.5+boisson.cout();
    }

}
