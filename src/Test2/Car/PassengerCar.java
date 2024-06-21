package Test2.Car;

import java.util.*;

// Leaf node of a 'Train'. 'PassengerCar' implements 'SingleCar'.
//
public class PassengerCar implements SingleCar // TODO: uncomment clause.
{




    // Returns a readable representation of the train with all its cars in the corresponding
    // order, where couplings are represented by '-' and cars are represented by "[<X>]" where <X>
    // stands for the type of the car.
    // For example: "[P]" is a single passenger car and "[C]" is a single cargo car, both being
    // trains themselves.
    // "[P]-[P]-[C]" is a train with two passenger cars in the front and one cargo car in the rear.

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
