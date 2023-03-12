package Patterns.AbstractFactory.start;

import Patterns.AbstractFactory.Factory.RussianFactory;
import Patterns.AbstractFactory.Factory.USAFactory;
import Patterns.AbstractFactory.FactoryInterfaces.TransportFactory;
import Patterns.AbstractFactory.transport.interfaces.Aircraft;
import Patterns.AbstractFactory.transport.interfaces.Car;

public class StartAbstractFactory {

    public static void main(String[] args) {

        TransportFactory russianFactory = new RussianFactory();
        Aircraft aircraft = russianFactory.createAircraft();

        TransportFactory USAFactory = new USAFactory();
        Car car = USAFactory.createCar();

    }
}
