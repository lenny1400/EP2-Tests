package Test2.Car;

// A list of 'Coupling' elements.
// For simplicity, only the last element of the list can be accessed.
//
// Please, do not change this interface definition!
//
public interface CouplingList {

    // Returns the last element of this list (the one with the highest index).
    // Leaves the list unchanged.
    // Returns 'null' if this list is empty.
    Coupling peekLast();

    // Returns the number of elements in this list.
    int size();
}
