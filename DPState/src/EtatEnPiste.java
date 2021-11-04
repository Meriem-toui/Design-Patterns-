public class EtatEnPiste extends State {

    public EtatEnPiste(AvionImpl avoin) {
        super(avoin);
    }

    public
    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du garage je suis deja en piste");
    }

    @Override
    void executeEntreAuGarage() {
        System.out.println("Transition d'etat de en Piste => Garage");
        avoin.state=new EtatAuGarage(avoin);

    }

    @Override
    void executeDecoller() {
        System.out.println("Transition d'etat de en Piste => Decoler");
        avoin.state=new EtatEnLair(avoin);

    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible, je suis deja en piste  ");

    }

    @Override
    void executeDoActivity() {
        for(int i=0 ;i<4 ;i++){
        System.out.println("Activit de l'etat en piste ..... ");}
    }
}
