package by.minsk.itakademy.zimin.homework.vehicle;


import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<Vehicle>(new Car("Audi",3000,6,4,Color.YELLOW,Fuel.DIESEL));
      Garage<Vehicle> garage1=new Garage<Vehicle>(new Motorcycle("Yamaha",600,5,2,Color.WHITE,Fuel.GASOLINE95));

        ListIterator listIterator= garage.technicalVehicle.listIterator();
      while (listIterator.hasNext()){
          listIterator.next();
          System.out.println(listIterator);
      }

        System.out.println(garage.technicalVehicle);


    }
}
