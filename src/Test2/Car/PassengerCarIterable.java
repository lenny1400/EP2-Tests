package Test2.Car;

// An object with a method that returns a 'PassengerCarIterator'.
// Please, do not change this interface definition!
//
public interface PassengerCarIterable extends Iterable<PassengerCar> {

    // Returns an iterator over all 'Coupling' objects of the mobile.
    PassengerCarIterator iterator();
}
