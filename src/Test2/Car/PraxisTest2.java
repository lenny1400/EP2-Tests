package Test2.Car;

import java.util.ArrayList;
import java.util.List;

// This class can be modified and is for testing your solution.
// Modifications will NOT be reviewed or assessed.
//
public class PraxisTest2 {

    public static void main(String[] args) {


        PassengerCar passengerCar1 = new PassengerCar();
        PassengerCar passengerCar2 = new PassengerCar();
        CargoCar cargoCar1 = new CargoCar();
        Coupling train1 = new Coupling(passengerCar1, passengerCar2);
        Coupling train2 = new Coupling(cargoCar1, train1);
        Coupling train2equal = new Coupling(new Coupling(new CargoCar(), new PassengerCar()),
                new PassengerCar());

        System.out.println("\nTest 1: 'toString'");
        testEquals(train1.toString(),"[P]-[P]");
        testEquals(train2.toString(),"[C]-[P]-[P]");

        System.out.println("\nTest 2: Constructor of 'Coupling' throwing exception");
        try {
            new Coupling(cargoCar1, train2);
            System.out.println("Test NOT successful! This message should not be printed!");
        } catch (IdenticalTrainException e) {
            System.out.println("Successful test");
        }

        System.out.println("\nTest 3: equals");
        testEquals(cargoCar1, new CargoCar());
        testEquals(passengerCar2, passengerCar1);
        testEquals(train2, train2equal);

        System.out.println("\nTest 4: Iterator");
        PassengerCarIterator iter = train2.iterator();
        testEquals(iter.hasNext(), true);
        testEquals(iter.next()==passengerCar1, true);
        testEquals(iter.hasNext(), true);
        testEquals(iter.next()==passengerCar2, true);
        testEquals(iter.hasNext(), false);

        System.out.println("\nTest 5: iterator throwing exception");
        try {
            iter.next();
            System.out.println("Test NOT successful! This message should not be printed!");
        } catch (java.util.NoSuchElementException e) {
            testEquals(e.getMessage(), "no passenger car element!");
        }

        System.out.println("\nTest 6: asList");
        ArrayList<SingleCar> al = new ArrayList<>();
        al.add(cargoCar1);
        testEquals(cargoCar1.asList(), al);
        al.add(passengerCar1);
        al.add(passengerCar2);
        testEquals(train2.asList(), al);
        try {
            System.out.println(train2.asList().get(3));
            System.out.println("Test NOT successful! This message should not be printed!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Successful test");
        }

        System.out.println("\nTest 7: couplingListView");
        CouplingList cl = train2.couplingListView();
        testEquals(cl.size(), 2);
        testEquals(cl.peekLast() == train1, true);
        CargoCar last = new CargoCar();
        train2.append(last);
        testEquals(cl.size(), 3);
        List<SingleCar> list = cl.peekLast().asList();
        testEquals(list.get(list.size()-1) == last, true);


    }

    public static void testEquals(Object given, Object expected) {
        if (given == null) {
            if(expected == null) {
                System.out.println("Successful test");
            } else {
                System.out.println("Test NOT successful! Expected value: " + expected.toString() + " / Given " +
                        "value: null");
            }
        } else {
            if (given.equals(expected)) {
                System.out.println("Successful test");
            } else {
                System.out.println("Test NOT successful! Expected value: " + expected.toString() + " / Given " +
                        "value: " + given.toString());
            }
        }
    }
}
