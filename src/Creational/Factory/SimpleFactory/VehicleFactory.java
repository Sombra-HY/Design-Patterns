package Creational.Factory.SimpleFactory;
/*
* VehicleFactory é uma classe que cria outros objetos no caso Vehicle
*
* */
class VehicleFactory {
    public static Vehicle get_Vehicle(String typeVehicle) {
        switch (typeVehicle) {
            case "LuxuryCar":
                return new LuxuryCar();
            case "PopularCar":
                return new PopularCar();
            case "MotoCycle":
                return new MotoCycle();
            default:
                return null;
        }
    }

}
