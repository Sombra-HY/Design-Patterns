package Creational.Factory.FactoryMethod;

public abstract class  Vehicle {
   abstract void seacrhVehicle();
}

class LuxuryCar extends Vehicle {
    @Override
    public void seacrhVehicle() {
        System.out.println("LuxuryCar");
    }
}
class PopularCar extends Vehicle {
    @Override
    public void seacrhVehicle() {
        System.out.println("PopularCar");
    }
}
class MotoCycle extends Vehicle {
    @Override
    public void seacrhVehicle() {
        System.out.println("MotorCycle");
    }
}
