
public class AvionImpl implements Avion {
      protected   State state;

     public AvionImpl(){
         state=new EtatEnPiste(this);
     }
    @Override
    public void sortirDuGarage() {
       state.executeSortirDuGarage();
    }

    @Override
    public void entreAuGarage() {
      state.executeEntreAuGarage();
    }

    @Override
    public void decoller() {
       state.executeDecoller();
    }

    @Override
    public void atterir() {
    state.executeAtterir();
    }

    @Override
    public void doActivity() {
       state.executeDoActivity();
    }




}
