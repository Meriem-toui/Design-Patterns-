
public class ICalculIGR_2 implements ICalcul {

    private Employe employe;

    @Override
    public float calculerIGR(float salaireBrutMensuel) {
        float taux=35;
        return (salaireBrutMensuel*12*taux)/100;

    }
}
