package Test2.Operation;

import java.util.*;

// This class implements 'StringOperationSingle' and represents an insertion operation on a string.
//
public class InsertOperation implements StringOperationSingle
{


    // Initializes this with the specified string 'toInsert' and the 'startIndex' where the string
    // will be inserted by this operation. For example, if 'toInsert' is "xyz" and 'startIndex'
    // is 2 then 'apply("abcd")' will return "abxyzcd".
    // Precondition: toInsert != null, startIndex >= 0.
    public InsertOperation(String toInsert, int startIndex) {

    }

    // @Override
    // Applies this operation to the specified operand and returns the result.
    // Throws an 'OperationException' if 'startIndex < 0' or if 'startIndex > operand.length()'.
    // The detail message of the exception is "startIndex i, length l" where 'i' is the specified
    // 'startIndex' of 'this' and 'l' is operand.length().
    // Precondition: operand != null.
    public String apply(String operand) throws OperationException {
        return null;
    }

    @Override
    public StringOperation andThen(StringOperation after) {
        return null;
    }

    @Override
    public void substitute(StringOperationSingle toSubstitute, StringOperationSingle substituteWith) {

    }

        // würde jetzt die liste mittels contains() durchsuchen, wenn der String drin ist, mit list.remove(toSubsitute) löschen und
        // dann mittels list.add(subsituteWith) einfügen


    @Override
    // Returns a string representation of this operation in the form:
    // insert "xyz" at position i
    // where 'xyz' stands for the specified string 'toInsert' and 'i' stands for
    // the specified position 'startIndex'.
    public String toString() {
        return "";
    }

    // Returns 'true' only if 'this' and 'o' are equal. 'this' and 'o' are considered to
    // be equal if they are of the same class and have equal parameter values (for
    // the parameters specified to the constructor of this operation).


    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(null, null);
    }

    @Override
    public Countable getCountable(StringOperationSingle search) {
        return null;
    }

    // The iterator of this class iterates over only one element.
    // See examples in 'PraxisTest2.
    @Override
    public OperationSingleIterator iterator() {
        return null;
    }
}
