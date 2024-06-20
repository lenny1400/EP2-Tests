package Test1.PolynomialMonomial;

/**
 * A polynomial that is made of multiple monomials. The simplest
 * polynomial is made of one single monomial.
 */
//
// TODO: Complete the methods in 'Building'.
//       You can define further classes and methods if needed.
//       Do NOT use the Java-Collection framework in 'Building' or any other class.
//
public class Polynomial {

    //TODO: additional variables, constructors and methods must be private.
    MonomialTreeSet polynomial;

    /**
     * Initializes this polynomial as a sum of the monomials in set.
     *
     * @param set, the set of monomials to be summed up, set is not empty.
     */
    public Polynomial(MonomialTreeSet set) {
        //TODO: define constructor.
        this.polynomial = set;
    }

    /**
     * Returns a string representation of this polynomial in which the terms appear ordered
     * according to their degree and there is at most one term with a specific degree (terms of
     * the same degree are represented by their sum).
     * In case of a negative coefficient a preceding '+' is not written. Monomials with
     * coefficient of 0 do not appear in the string representation.
     * Example: "1x^0+2x^3+1x^4-3x^5"
     *
     * @return the string representation of this polynomial.
     */
    public String toString() {
        // TODO: implement method.
        if (this.polynomial == null){
            return "";
        }else{
            String txt = "";
            MonomialQueue q = new MonomialQueue();
            this.polynomial.addAllToQueue(q);

            if (q.size() < 1){
                return txt;
            }else{
                Monomial[] array = new Monomial[q.size()];
                int size = q.size();
                if (size == 1){
                    return txt + q.poll();
                }
                int i = 0;
                while (q.size() > 0){
                    array[i] = q.poll();
                    i++;
                }

                for (int j = 0; j < size; j++) {
                    if (array[j] != null){
                        for (int k = 1; k < size; k++) {
                            if (k != j){
                                if (theSame(array[j], array[k])){
                                    array[j] = array[j].plus(array[k]);
                                    array[k] = null;
                                }
                            }
                        }
                    }
                }

                for (int j = 0; j < size; j++) {
                    if (array[j] != null){
                        if (array[j].getCoefficient() == 0){
                            array[j] = null;
                        }
                    }
                }

                boolean isFirst = true;
                for (int j = 0; j < size; j++) {
                    if (isFirst){
                        if (array[j] != null){
                            txt = array[j].toString();
                            isFirst = false;
                        }
                    }else{
                        if (array[j] != null){
                            if (array[j].getCoefficient() < 0){
                                txt = txt + array[j].toString();
                            }else{
                                txt = txt + "+" + array[j].toString();
                            }
                        }
                    }
                }
            }

            return txt;
        }
    }

    private boolean theSame(Monomial m1, Monomial m2){
        if (m1 == null || m2 == null){
            return false;
        }
        if (m1.getDegree() == m2.getDegree()){
            return true;
        }else {
            return false;
        }
    }
}

// TODO: define further classes, if needed (either here or in a separate file).