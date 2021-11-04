public class EtatEnLair extends State {

    public EtatEnLair(AvionImpl avoin) {
        super(avoin);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du Garage ,je suis aen l'air ");
    }

    @Override
    void executeEntreAuGarage() {
        System.out.println("Impossible d'entrer au Garage ,je suis en l'air ");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de decoller ,je suis deja  en l'air ");
    }

    @Override
    void executeAtterir() {
        System.out.println("Transition d'etat en l'air  => piste");
        avoin.state=new EtatEnPiste(avoin);
    }

    @Override
    void executeDoActivity() {
        for(int i=0 ;i<4 ;i++){
            System.out.println("Activite de l'etat en L'air ..... ");}
    }

}


