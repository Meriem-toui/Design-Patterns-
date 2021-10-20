package decorator;

import composants.Boisson;

public class Vanille extends DecoratorAbstract {

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {

        return 23+boisson.cout();
    }

    @Override
    public String getDescripton() {

        return boisson.getDescription()+ "au Vanille";
    }
}
