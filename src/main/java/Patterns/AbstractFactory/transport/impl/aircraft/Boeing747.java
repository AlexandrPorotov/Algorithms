package Patterns.AbstractFactory.transport.impl.aircraft;

import Patterns.AbstractFactory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("Boeing747 fly");
    }
}
