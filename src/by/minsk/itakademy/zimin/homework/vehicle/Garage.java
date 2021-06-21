package by.minsk.itakademy.zimin.homework.vehicle;

import java.util.*;

public class Garage<T extends Vehicle> {


    public ArrayList<Vehicle> technicalVehicle = new ArrayList<Vehicle>();

    public Garage(Vehicle technicalVehicles) {
        technicalVehicle.add(technicalVehicles);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "technicalVehicle=" + technicalVehicle +
                '}';
    }
}
