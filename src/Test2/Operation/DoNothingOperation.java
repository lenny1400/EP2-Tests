package Test2.Operation;

// Represents an operation with no effect on the specified operand.
//
public class DoNothingOperation implements StringOperationSingle //TODO: activate clause.
{
    // The only instance of this class.
    public static DoNothingOperation DO_NOTHING = new DoNothingOperation();

    // Initializes 'this'.
    private DoNothingOperation() {}

    //@Override
    // Applies this operation to the specified operand and returns the result.
    // 'DO_NOTHING.apply(operand)' returns the unchanged operand.
    public String apply(String operand) {
        //TODO: implement
        return null;
    }

    //@Override
    // Returns a new 'StringOperationSequence' object in which 'after' is applied to 'this'.
    public StringOperation andThen(StringOperation after) {
        //TODO: implement
        return null;

    }

    @Override
    public void substitute(StringOperationSingle toSubstitute, StringOperationSingle substituteWith) {

    }

    @Override
    public Countable getCountable(StringOperationSingle search) {
        return null;
    }

    @Override
    public OperationSingleIterator iterator() {
        return null;
    }


    //TODO: define missing parts of this class.
}
