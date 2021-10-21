public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private ICalcul calcul=new ICalculIGR_1();


    public Employe(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;

    }

    public Employe() {
    }

    public float getSalaireNetMensuel(){
        float igr=calcul.calculerIGR(salaireBrutMensuel);
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;

    }

    ///getters and setters

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {

        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public String getCin() {

        return cin;
    }

    public void setCin(String cin) {

        this.cin = cin;
    }

    public ICalcul getCalcul() {
        return calcul;
    }

    public void setCalcul(ICalcul calcul) {
        this.calcul = calcul;
    }
}
