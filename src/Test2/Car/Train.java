package Test2.Car;

import java.util.List;

// A train as an ordered sequence of 'SingleCar' elements.
//
// Please, do not change this interface definition!
//
public interface Train extends PassengerCarIterable {

    // Returns a readable representation of the train with all its cars in the corresponding
    // order, where couplings are represented by '-' and cars are represented by "[<X>]" where <X>
    // stands for the type of the car.
    // For example: "[P]" is a single passenger car and "[C]" is a single cargo car, both being
    // trains themselves.
    // "[P]-[P]-[C]" is a train with two passenger cars in the front and one cargo car in the rear.
    String toString();

    // Returns 'true' if 'this' and 'o' are equal.
    boolean equals(Object o);

    // Returns the hash code of 'this'.
    int hashCode();

    // Returns a 'CouplingList' view of 'this' with all 'Coupling' objects of this train
    // as elements in the corresponding order (front to rear), meaning that the method 'peekLast'
    // of the list returns the coupling which connects the last single car at the rear of the train
    // to some other part of the train.
    // Later changes in 'this' will be reflected in the returned view.
    CouplingList couplingListView();

    // Returns a new list with all cars of this train. The order of
    // this list is from front (low index) to the rear of the train (high index).
    List<SingleCar> asList();

    // Returns an iterator over all 'PassengerCar' objects in 'this' train. The order of
    // iteration is from front to the rear of the train.
    PassengerCarIterator iterator();
}
