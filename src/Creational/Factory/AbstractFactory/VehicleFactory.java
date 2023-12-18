package Creational.Factory.AbstractFactory;

interface VehicleFactory{
      PopularVehicle get_PopularCar();
      PopularVehicle get_PopularMoto();
      LuxuryVehicle get_LuxuryCar();
      LuxuryVehicle get_LuxuryMoto();

}

class VehicleZNFactory implements VehicleFactory{
     public PopularVehicle get_PopularCar(){
         return new PopularCarZN();
     }
     public PopularVehicle get_PopularMoto(){
         return new PopularMotoZN();
     }
     public LuxuryVehicle get_LuxuryCar(){
         return new LuxuryCarZN();
     }
     public LuxuryVehicle get_LuxuryMoto(){
         return new LuxuryMotoZN();
     }
}

class VehicleZSFactory implements VehicleFactory{
     public PopularVehicle get_PopularCar(){
         return new PopularCarZS();
     }
     public PopularVehicle get_PopularMoto(){
         return new PopularMotoZS();
     }
     public LuxuryVehicle get_LuxuryCar(){
         return new LuxuryCarZS();
     }
     public LuxuryVehicle get_LuxuryMoto(){
         return new LuxuryMotoZS();
     }
}