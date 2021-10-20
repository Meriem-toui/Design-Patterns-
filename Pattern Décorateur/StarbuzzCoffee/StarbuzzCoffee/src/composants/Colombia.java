package composants;

public class Colombia extends Boisson {

    public  Colombia(){
        description="Colombia";
    }

    @Override
    public double cout() {

        return 19;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
