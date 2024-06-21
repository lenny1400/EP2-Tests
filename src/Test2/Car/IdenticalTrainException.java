package Test2.Car;

// An Exception thrown by 'Coupling'.
//
public class IdenticalTrainException extends RuntimeException {
    public IdenticalTrainException() {
    }

    public IdenticalTrainException(String message) {
        super(message);
    }
}
