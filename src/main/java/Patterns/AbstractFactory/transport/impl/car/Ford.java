package Patterns.AbstractFactory.transport.impl.car;

import Patterns.AbstractFactory.transport.interfaces.Car;

public class Ford implements Car {
    @Override
    public void drive() {
        System.out.println("Ford drive");
    }

    @Override
    public void stop() {
        System.out.println("Ford stop");
    }
}
