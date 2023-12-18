package Creational.Factory.AbstractFactory;

abstract class PopularVehicle implements Vehicle {
    public abstract void searchClient();
}
class PopularCarZN extends PopularVehicle{
    @Override
    public void searchClient() {
        System.out.println("Carro Popular ZN!");
    }
}
class PopularCarZS extends PopularVehicle{
    @Override
    public void searchClient() {
        System.out.println("Carro Popular Zs!");
    }
}
class PopularMotoZN extends PopularVehicle{
    @Override
    public void searchClient() {
        System.out.println("Moto Popular! ZN");
    }
}class PopularMotoZS extends PopularVehicle{
    @Override
    public void searchClient() {
        System.out.println("Moto Popular! ZS");
    }
}