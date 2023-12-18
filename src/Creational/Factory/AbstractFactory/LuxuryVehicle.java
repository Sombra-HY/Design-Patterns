package Creational.Factory.AbstractFactory;


abstract class LuxuryVehicle implements Vehicle{
    public abstract void searchClient();
}


class LuxuryCarZN extends LuxuryVehicle{
    @Override
    public void searchClient() {
        System.out.println("carro de luxo! ZN");
    }
}
class LuxuryCarZS extends LuxuryVehicle{
    @Override
    public void searchClient() {
        System.out.println("carro de luxo! ZS" );
    }
}
class LuxuryMotoZN extends LuxuryVehicle{
    @Override
    public void searchClient() {
        System.out.println("Moto de luxo! ZN");
    }
}
class LuxuryMotoZS extends LuxuryVehicle{
    @Override
    public void searchClient() {
        System.out.println("Moto de luxo! ZS");
    }
}

