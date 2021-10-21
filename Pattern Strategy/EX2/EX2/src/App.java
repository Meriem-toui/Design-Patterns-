public class App {
    public static void main(String[] args) {
      Employe employe= new Employe("E123547", 38553);
        employe.setCalcul(new ICalculIGR_2());
        System.out.println("Employé en Algerie :");
        System.out.println(" Salaire Brut mensuel :"+employe.getSalaireBrutMensuel());
        System.out.println(" Salaire Net Mensuel après calcul: "+employe.getSalaireNetMensuel());


        Employe employee2 = new Employe("e3242", 15000);
        employee2.setCalcul(new ICalculIGR_1());
        System.out.println("Employé au Maroc :");
        System.out.println(" Salaire Brut mensuel :"+employee2.getSalaireBrutMensuel());
        System.out.println(" Salaire Net Mensuel après calcul: "+employee2.getSalaireNetMensuel());
    }
}
