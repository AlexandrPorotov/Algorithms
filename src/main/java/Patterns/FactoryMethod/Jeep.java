package Patterns.FactoryMethod;

public class Jeep implements Car{
    @Override
    public void drive() {
        System.out.println("Jeep drive 90 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Jeep stop");
    }
}
