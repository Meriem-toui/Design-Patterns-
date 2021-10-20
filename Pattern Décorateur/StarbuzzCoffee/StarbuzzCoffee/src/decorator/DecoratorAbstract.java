package decorator;

import composants.Boisson;

public abstract  class DecoratorAbstract extends Boisson{
   protected Boisson boisson;

    public DecoratorAbstract(Boisson boisson) {
        this.boisson = boisson;
    }
   public abstract String getDescripton();

}
