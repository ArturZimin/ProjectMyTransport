package by.minsk.itakademy.zimin.homework.vehicle;

public class Vehicle implements VehicleFunctions {
    private int numbersOfWheel;
    private String name;
    private Color color;
    private Fuel typeFuel;
    int engineVolume;
    int numbersOfGears;
    boolean engineOnOf;
    boolean standsOrRides;

    public Vehicle(String motorcycleName, int engineVolume, int numbersOfGears, int numbersOfWheel, Color color, Fuel typeFuel) {
    }


    public void Vehicle(String transportName, int engineVolume, int numbersOfGears, int numbersOfWheel, Color color,
                        Fuel typeFuel) {
        this.name = transportName;
        this.engineVolume = engineVolume;
        this.numbersOfGears = numbersOfGears;
        this.numbersOfWheel = numbersOfWheel;
        this.color = color;
        this.typeFuel = typeFuel;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "numbersOfWheel=" + numbersOfWheel +
                ", transportName='" + name + '\'' +
                ", color=" + color +
                ", typeFuel=" + typeFuel +
                ", engineVolume=" + engineVolume +
                ", numbersOfGears=" + numbersOfGears +
                ", engineOnOf=" + engineOnOf +
                ", standsOrRides=" + standsOrRides +
                '}';
    }


}
