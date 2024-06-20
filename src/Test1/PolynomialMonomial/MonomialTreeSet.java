package Test1.PolynomialMonomial;

/**
 * A set of 'Monomial' objects implemented as a binary search tree. The monomials are ordered
 * according to their degree. Monomials of the same degree are ordered according to their
 * coefficient.
 * The set allows multiple monomials to have the same degree and coefficient as long as
 * the monomials are not identical. The order of monomials with the same degree
 * and coefficient is not specified.
 * The number of elements of the set is not limited. The set does not have entries of 'null'.
 */
//
// TODO: Complete the methods in 'MonomialTreeSet'.
//       You can define further classes and methods for the implementation of the
//       binary search tree if needed.
//       Do NOT use the Java-Collection framework in 'MonomialTreeSet' or any other class.
//
public class MonomialTreeSet {

    //TODO: additional variables, constructors and methods must be private.
    Tree root;

    /**
     * Initializes 'this' as an empty list.
     */
    public MonomialTreeSet() {
        //TODO: implement constructor.
        this.root = null;
    }

    /**
     * Initializes this set as an independent copy of 'set'. Later changes of 'this'
     * will not affect 'set' and vice versa.
     *
     * @param set the set from which the elements are copied to 'this', set != null.
     */
    public MonomialTreeSet(MonomialTreeSet set) {
        //TODO: implement constructor.

    }

    /**
     * Adds the specified element 'm' to this set. If 'm' is already contained in this set,
     * the methods has no effect.
     *
     * @param m the monomial that is added, m != null.
     */
    public void add(Monomial m) {
        //TODO: implement method.
        if (this.root == null){
            this.root = new Tree(m);
        }else{
            if (m.getCoefficient() != 0){
                this.root.add(m);
            }
        }
    }

    /**
     * Returns 'true' if and only if 'm' is contained in this set. More formally, returns
     * 'true' if and only if this set contains an element 'e' such that e == m.
     * (There can be at most one such element.)
     *
     * @param m the element to be checked, m != null.
     * @return 'true' if and only if 'm' is contained in this set.
     */
    public boolean contains(Monomial m) {
        //TODO: implement method.
        if (this.root == null){
            return false;
        }else{
            return this.root.contains(m);
        }
    }

    /**
     * Adds all elements of this set to the specified queue in the order of the tree.
     * The monomial with the lowest degree (and coefficient) is added first.
     *
     * @param q the queue to which all elements of 'this' are added, q != null.
     */
    public void addAllToQueue(MonomialQueue q) {
        //TODO: implement method.
        if (this.root != null){
            this.root.addAllToQueue(q);
        }
    }

}

class Tree{

    Tree left, right;
    Monomial value;

    public Tree(Monomial m){
        this.left = null;
        this.right = null;
        this.value = m;
    }

    public Tree(Tree left, Tree right, Monomial m){
        this.left = left;
        this.right = right;
        this.value = m;
    }

    public void add(Monomial m){
        if (this.value.getDegree() > m.getDegree()){
            if (this.left == null){
                this.left = new Tree(m);
            }else{
                this.left.add(m);
            }
        } else if (this.value.getDegree() < m.getDegree()) {
            if (this.right == null){
                this.right = new Tree(m);
            }else{
                this.right.add(m);
            }
        }else{
            if (this.value.getCoefficient() != m.getCoefficient()){
                if (this.value.getCoefficient() > m.getCoefficient()){
                    if (this.left == null){
                        this.left = new Tree(m);
                    }else{
                        this.left.add(m);
                    }
                }else{
                    if (this.right == null){
                        this.right = new Tree(m);
                    }else{
                        this.right.add(m);
                    }
                }
            }
        }
    }

    public boolean contains(Monomial m){
        if (this.value.getDegree() == m.getDegree()){
            if (this.value.getCoefficient() == m.getCoefficient()){
                return true;
            } else if (this.value.getCoefficient() > m.getCoefficient()) {
                if (this.left == null){
                    return false;
                }else{
                    return this.left.contains(m);
                }
            } else if (this.value.getCoefficient() < m.getCoefficient()) {
                if (this.right == null){
                    return false;
                }else{
                    return this.right.contains(m);
                }
            }
        }else if (this.value.getDegree() > m.getDegree()){
            if (this.left == null){
                return false;
            }else{
                return this.left.contains(m);
            }
        }else{
            if (this.right == null){
                return false;
            }else{
                return this.right.contains(m);
            }
        }
        return false;
    }

    public void addAllToQueue(MonomialQueue q) {
        if (this.left != null) {
            this.left.addAllToQueue(q);
        }

        q.add(this.value);

        if (this.right != null) {
            this.right.addAllToQueue(q);
        }
    }
}

// TODO: define further classes, if needed (either here or in a separate file).
