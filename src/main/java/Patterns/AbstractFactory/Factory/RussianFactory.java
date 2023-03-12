package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.FactoryInterfaces.TransportFactory;
import Patterns.AbstractFactory.transport.impl.aircraft.TU134;
import Patterns.AbstractFactory.transport.impl.car.Niva;
import Patterns.AbstractFactory.transport.interfaces.Aircraft;
import Patterns.AbstractFactory.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
