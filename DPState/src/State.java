abstract public class State {
    protected AvionImpl avoin;

      public State(AvionImpl avoin){
          this.avoin=avoin;

      }
    abstract void executeSortirDuGarage();
    abstract void executeEntreAuGarage();
    abstract void  executeDecoller();
    abstract void  executeAtterir();
    abstract void  executeDoActivity();
}

