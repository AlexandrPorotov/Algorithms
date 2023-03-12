package Patterns.FactoryMethod;

//фабрика по созданию автомобилей
public class CarSelector {

    private static CarSelector instance;

    //Singleton
    public static CarSelector getInstance() {
        if(instance == null) {
            instance = new CarSelector();
        }
        return instance;
    }

    private CarSelector(){
    }

    //фабричный метод, который создает нужный автомобиль
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case CITY:
                car = new Porsche();
                break;
            case TRACK:
                car = new Audi();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
        }
        return car;
    }
}
