package Creational.Factory.FactoryMethod;

/*
* Contexto: Problema
*  Aplicativo de taxi, no qual é possivel pedir varios tipos de veiculos diferentes, mas existe filiais
* em diferentes regioes e cada regiao suporta uma quantidade de tipos de veiculos diferentes
* por exemplo, na regiao norte, suponha que nao existem motos...
* */

/*
* explicacao:
* existem varios tipos de veiculos e varias regioes onde pode ou nao existir um veiculo naquela regiao,
* por isso, e feito uma abstracao da fabrica de veiculos
*
*
* */

public class Client {
    public static void main(String[] args) {
        String [] typesNorth = {"PopularCar","LuxuryCar","MotoCycle"};

        System.out.println("Zona norte");
        for (String str:typesNorth) {
            NorthZoneVehicleFactory obj = new NorthZoneVehicleFactory(str);
            obj.search_Vehicle();
        }

        System.out.println("Zona Sul");
        String [] typesWest = {"LuxuryCar"};
        for (String str:typesWest) {
            WestZoneVehicleFactory obj = new WestZoneVehicleFactory(str);
            obj.search_Vehicle();

        }
    }
}

//"""
//Factory method é um padrão de criação que permite definir uma interface para
//criar objetos, mas deixa as subclasses decidirem quais objetos criar. O
//Factory method permite adiar a instanciação para as subclasses, garantindo o
//baixo acoplamento entre classes.
//"""

