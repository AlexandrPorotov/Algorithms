package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.FactoryInterfaces.TransportFactory;
import Patterns.AbstractFactory.transport.impl.aircraft.Boeing747;
import Patterns.AbstractFactory.transport.impl.car.Ford;
import Patterns.AbstractFactory.transport.interfaces.Aircraft;
import Patterns.AbstractFactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
