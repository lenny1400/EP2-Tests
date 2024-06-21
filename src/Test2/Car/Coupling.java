package Test2.Car;

import java.util.*;

// A 'Coupling' is a train consisting of two (front and rear) parts of a train that have been
// attached by this coupling. Because 'Coupling' implements 'Train' and the front and rear part are
// of type 'Train' we naturally get tree-like structures, where 'Coupling' has two child
// nodes and objects of 'SingleCar' form the leafs of the tree. The implementation of this class
// can, but need not be based on a tree structure.
//
// Examples:
// Coupling c1 = new Coupling(new PassengerCar(), new PassengerCar());
// Coupling c2 = new Coupling(c1, new CargoCar());
//
//      c2
//     /  \
//    c1   \
//   /  \   \
//  [P]-[P]-[C]
//
// c2 = new Coupling(new PassengerCar(), new CargoCar());
// c1 = new Coupling(new PassengerCar(), c2);
//
//      c1
//     /  \
//    /   c2
//   /   /  \
//  [P]-[P]-[C]
//
// In both configurations the coupling list of the root coupling
// has the two elements c1, c2 in that order.
public class Coupling implements Train // TODO: uncomment clause.
{




    // Initialises this coupling with a front and rear part.
    // It is permissible to couple equal trains (according to the specification of the method
    // 'equals'). However, having two identical trains in a coupling is not allowed.
    // For example, attempting to couple a train to itself (new Coupling(train, train))
    // will throw an 'IdenticalTrainException'. Similarly, if the same train would appear twice
    // anywhere in the coupling (e.g., new Coupling(train, new Coupling(new PassengerCar(),
    // train))), it will also throw an 'IdenticalTrainException'. (Note that trains can
    // only be identical if they have identical 'SingleCar' components, so it is sufficient to
    // check for identical 'SingleCar' objects).
    // Preconditions: front != null, rear != null.
    public Coupling(Train front, Train rear) throws IdenticalTrainException {


    }

    // Appends the specified train to the rear of this train.
    // Throws an 'IdenticalTrainException' if the specified 'train' has a 'SingleCar' component
    // identical with a 'SingleCar' component in 'this' (see details in above description).
    // Precondition: train != null.
    public void append(Train train) throws IdenticalTrainException {

    
    }

    @Override
    // Returns 'true' if and only if 'o' is also of class 'Coupling' and 'this' and 'o'
    // represent equal trains with equal cars in the same order.
    //
    // For example,
    // new Coupling(new PassengerCar(), new Coupling(new PassengerCar(), new CargoCar()))
    // and
    // new Coupling(new Coupling(new PassengerCar(), new PassengerCar()), new CargoCar())
    // are equal.
    public boolean equals(Object o) {
       return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
       return "";
    }

    @Override
    public CouplingList couplingListView() {
        return null;
    }

    @Override
    public List<SingleCar> asList() {
        return null;
    }

    @Override
    public PassengerCarIterator iterator() {
        return null;
    }
}

// TODO: define additional classes if needed (either here or in a separate file).