package Patterns.FactoryMethod;

public class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Audi drive 200 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Audi stop");
    }
}
