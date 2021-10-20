package decorator;

import composants.Boisson;

public class Sirop extends DecoratorAbstract{

    public Sirop(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5 +boisson.cout();
    }

    @Override
    public String getDescripton() {

        return boisson.getDescription()+" au Sirop";
    }
}
