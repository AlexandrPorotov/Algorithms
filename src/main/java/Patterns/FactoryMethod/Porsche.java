package Patterns.FactoryMethod;

public class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("Porsche drive 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stop");
    }
}
