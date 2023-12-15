package Creational.Factory.FactoryMethod;

abstract class VehicleFactory{
    public Vehicle vehicle;
    VehicleFactory(String typeVehicle ){
        this.vehicle = get_Vehicle(typeVehicle);
    }

    abstract Vehicle get_Vehicle(String typeVehicle);

    public void search_Vehicle(){
        vehicle.seacrhVehicle();
    }

}

class NorthZoneVehicleFactory extends VehicleFactory{
    NorthZoneVehicleFactory(String typeVehicle) {
        super(typeVehicle);
    }
    @Override
    Vehicle get_Vehicle(String typeVehicle) {
        switch (typeVehicle) {
            case "LuxuryCar":
                return new LuxuryCar();
            case "PopularCar":
                return new PopularCar() ;
            case "MotoCycle":
                return new MotoCycle();
            default:
                return null;
        }
    }
}
class WestZoneVehicleFactory extends VehicleFactory{
    WestZoneVehicleFactory(String typeVehicle) {
        super(typeVehicle);
    }
    @Override
    Vehicle get_Vehicle(String typeVehicle) {
        switch (typeVehicle) {
            case "LuxuryCar":
                return new LuxuryCar();
            default:
                return null;
        }
    }
}