import composants.*;
import decorator.Caramel;
import decorator.Chocolat;
import decorator.Vanille;


public class APP {
    public static void main(String[] args) {
        Boisson boisson=new Espresso();
        System.out.println(boisson.getDescription());
         System.out.println(boisson.cout());
        System.out.println("______________------------------");

         boisson= new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("----------------------------------8777");

        Boisson b1=new Espresso();
        System.out.println(b1.getDescription()+" DH"+b1.cout());
        Boisson b2=new Colombia();
        b2=new Caramel(b2);
        b2=new Chocolat(b2);
        b2=new Chocolat(b2);
        System.out.println(b2.getDescription()+" DH "+b2.cout());

    }
}
