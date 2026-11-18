package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Hovercraft hovercraft = new Hovercraft("White", 8, 8, 600);
//        hovercraft.setColor("Orange");
//        System.out.println(hovercraft.getColor());
        System.out.println(hovercraft);

        Moped moped = new Moped("Silver",2,2,200);
//        moped.setColor("Red");
//        moped.setCargoCapacity(2);
//        moped.setNumberOfPassengers(2);
//        moped.setFuelCapacity(200);
//
//        System.out.println(moped.getColor());
//        System.out.println("Moped can carry " + moped.getNumberOfPassengers() + " passengers");
//        System.out.println(moped.getCargoCapacity());
//        System.out.println(moped.getFuelCapacity());
        System.out.println(moped);


        Car car = new Car("Black", 4, 4, 400);
//        car.setColor("Yellow");
//        System.out.println(car.getColor());
        System.out.println(car);

        SemiTruck semiTruck = new SemiTruck("Grey", 2, 10, 800);
//        semiTruck.setColor("Pink");
//        System.out.println(semiTruck.getColor());
        System.out.println(semiTruck);

//      Answer p. 21's question in a comment
//      in main: why can a Moped call setColor()
//      when you never created a Vehicle?
//     -Because the Moped extends to Vehicle and has access to its fields.
    }

}

