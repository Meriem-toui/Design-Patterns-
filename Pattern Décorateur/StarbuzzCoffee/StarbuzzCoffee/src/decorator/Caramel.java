package decorator;

import composants.Boisson;

public class Caramel extends DecoratorAbstract {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2+boisson.cout();
    }

    @Override
    public String getDescripton() {

        return boisson.getDescription()+"Au Caramelle";
    }
}
