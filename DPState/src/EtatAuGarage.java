public class EtatAuGarage extends State {

    public EtatAuGarage(AvionImpl avoin) {
        super(avoin);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Transition d'etat de Garage  => Piste");
        avoin.state=new EtatEnPiste(avoin);
    }

    @Override
    void executeEntreAuGarage() {
        System.out.println("Impossible, je suis deja au Garage  ");


    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de decoller ,je suis au Garage  ");

    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible d'atterir , je suis au Garage  ");

    }

    @Override
    void executeDoActivity() {
        for(int i=0 ;i<4 ;i++){
            System.out.println("Activite de l'etat au Garage..... ");}
    }

}


