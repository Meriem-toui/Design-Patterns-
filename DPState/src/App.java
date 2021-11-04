public class App {
    public static void main(String[] args) {
        Avion avion =new AvionImpl();
        avion.doActivity();
        System.out.println("---------------------");
        avion.sortirDuGarage();
        System.out.println("---------------------");
        avion.doActivity();
        System.out.println("---------------------");
        avion.entreAuGarage();
        System.out.println("---------------------");
        avion.doActivity();
        System.out.println("---------------------");
        avion.decoller();
        avion.atterir();
        avion.sortirDuGarage();
        System.out.println("---------------------");
        avion.doActivity();
        System.out.println("---------------------");
        avion.decoller();
        avion.doActivity();
        avion.entreAuGarage();
        avion.doActivity();
        avion.atterir();
        avion.doActivity();
        System.out.println("---------------------");



    }

}
