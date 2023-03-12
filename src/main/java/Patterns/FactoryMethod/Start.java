package Patterns.FactoryMethod;

public class Start {

    public static void main(String[] args) {

        Car car = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
        car.drive();

        car = CarSelector.getInstance().getCar(RoadType.CITY);
        car.drive();

        car = CarSelector.getInstance().getCar(RoadType.TRACK);
        car.drive();

    }

}
