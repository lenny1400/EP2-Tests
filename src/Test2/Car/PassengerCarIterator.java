package Test2.Car;

import java.util.Iterator;

// An iterator over 'PassengerCar' objects.
// Please, do not change this interface definition!
//
public interface PassengerCarIterator extends Iterator<PassengerCar> {

    // Returns 'true' if the iteration has more elements.
    boolean hasNext();

    // Returns the next element in the iteration.
    // Throws a 'java.util.NoSuchElementException' if the iteration has no more elements. The
    // detail massage of the exception is "no passenger car element!".
    PassengerCar next();
}
