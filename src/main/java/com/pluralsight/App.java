package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Orange");
        System.out.println(hovercraft.getColor());

        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setCargoCapacity(2);
        moped.setNumberOfPassengers(2);
        moped.setFuelCapacity(200);

        System.out.println(moped.getColor());
        System.out.println("Moped can carry " + moped.getNumberOfPassengers() + " passengers");
        System.out.println(moped.getCargoCapacity());
        System.out.println(moped.getFuelCapacity());


        Car car = new Car();
        car.setColor("Yellow");
        System.out.println(car.getColor());

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("Pink");
        System.out.println(semiTruck.getColor());

//      Answer p. 21's question in a comment
//      in main: why can a Moped call setColor()
//      when you never created a Vehicle?
//     -Because the Moped extends to Vehicle and has access to its fields.
    }

}

