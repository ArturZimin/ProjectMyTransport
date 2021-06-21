package by.minsk.itakademy.zimin.homework.vehicle;

public class Car extends Vehicle {

    private String carName;

    public Car(String carName, int engineVolume, int numbersOfGears, int numbersOfWheel, Color color, Fuel typeFuel) {
        super(carName, engineVolume, numbersOfGears, numbersOfWheel, color, typeFuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", engineVolume=" + engineVolume +
                ", numbersOfGears=" + numbersOfGears +
                ", engineOnOf=" + engineOnOf +
                ", standsOrRides=" + standsOrRides +
                '}';
    }
}
