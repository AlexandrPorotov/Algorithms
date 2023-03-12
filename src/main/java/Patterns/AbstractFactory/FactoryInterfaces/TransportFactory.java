package Patterns.AbstractFactory.FactoryInterfaces;

import Patterns.AbstractFactory.transport.interfaces.Aircraft;
import Patterns.AbstractFactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();
    Aircraft createAircraft();

}
