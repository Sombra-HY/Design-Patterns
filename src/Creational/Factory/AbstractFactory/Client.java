package Creational.Factory.AbstractFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

//"""
//Abstract Factory é um padrão de criação que fornece uma interface para criar
//famílias de objetos relacionados ou dependentes sem especificar suas classes
//concretas. Geralmente Abstract Factory conta com um ou mais Factory Methods
//para criar seus objetos.
//
//Uma diferença importante entre Factory Method e Abstract Factory é que o
//Factory Method usa herança, enquanto Abstract Factory usa a composição.
//
//Princípio: programe para interfaces, não para implementações
//"""

public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ArrayList<Class<? extends VehicleFactory>> list = new ArrayList<>();
        list.add(VehicleZNFactory.class);
        list.add(VehicleZSFactory.class);

        for (Class<? extends VehicleFactory> tClass: list) {
            Constructor<? extends VehicleFactory> constructor = tClass.getDeclaredConstructor();
            VehicleFactory factory = constructor.newInstance();
            factory.get_LuxuryCar().searchClient();
            factory.get_LuxuryMoto().searchClient();
            factory.get_PopularMoto().searchClient();
            factory.get_PopularCar().searchClient();
        }
    }
}
