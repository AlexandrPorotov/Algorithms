package Patterns.AbstractFactory.transport.impl.aircraft;

import Patterns.AbstractFactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("TU134 fly");
    }
}
