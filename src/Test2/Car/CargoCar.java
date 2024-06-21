package Test2.Car;

import java.util.*;

// Leaf node of a 'Train'. 'CargoCar' implements 'SingleCar'.
//
public class CargoCar implements SingleCar
{



    // Returns a 'CouplingList' view of 'this' with all 'Coupling' objects of this train
    // as elements in the corresponding order (front to rear), meaning that the method 'peekLast'
    // of the list returns the coupling which connects the last single car at the rear of the train
    // to some other part of the train.
    // Later changes in 'this' will be reflected in the returned view.
    @Override
    public CouplingList couplingListView() {
        return null;
    }
    // Returns a new list with all cars of this train. The order of
    // this list is from front (low index) to the rear of the train (high index).
    @Override
    public List<SingleCar> asList() {
       return null;
    }
    // Returns an iterator over all 'PassengerCar' objects in 'this' train. The order of
    // iteration is from front to the rear of the train.
    @Override
    public PassengerCarIterator iterator() {
        return null;
    }
}
