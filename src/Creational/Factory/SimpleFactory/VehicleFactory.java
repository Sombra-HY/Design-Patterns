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
/*
* Nao necessariamente a fabrica precisa retornar os objetos, tambem
* é aceitavel a fabrica conter os objetos, por exemplo, no construtor o tipo ja ser
* referenciado, assim o objeto jé é criado logo de unicio... (Static or not Static)
* */