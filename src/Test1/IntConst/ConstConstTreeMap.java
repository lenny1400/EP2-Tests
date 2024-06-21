package Test1.IntConst;

import java.util.LinkedList;
import java.util.List;

/**
 * This data structure maps keys ('IntConst' objects) to values ('IntConst' objects).
 * It is implemented as a binary search tree where keys are ordered according to the order
 * relation of the 'IntConst' class defined by its 'lessThan' and 'isEqual' method.
 * For the keys k1 and k2 of any two mappings in this map the following condition holds:
 * k1.isEqual(k2) == false.
 * There is no limit on the number of key-value mappings stored in the map.
 */
//
// TODO: Complete the methods in 'ConstConstTreeMap'.
//       You can define further classes and methods for the implementation of the
//       binary search tree if needed.
//       Do NOT use the Java-Collection framework in 'ConstConstTreeMap' or any other class.
//
public class ConstConstTreeMap {

    //TODO: additional variables, constructors and methods must be private.
    TreeNode root;

    /**
     * Initializes 'this' as an empty map.
     */
    public ConstConstTreeMap() {
        //TODO: implement constructor.
        this.root = null;
    }

    /**
     * Constructs this map as a copy of the specified 'map'. This map has the same key-value mappings
     * as 'map'. If 'map' is changed later, it will not affect 'this' and vice versa.
     * @param map the map from which key-value mappings are copied to this new map, map != null.
     */
    public ConstConstTreeMap(ConstConstTreeMap map) {
        //TODO: implement constructor.
        if (map.root != null) {
            this.root = copy(map.root);
        }
    }

    private TreeNode copy(TreeNode root) {
        if (root == null){
            return null;
        }

        TreeNode newNode = new TreeNode(root.key, root.value);
        newNode.left = copy(root.left);
        newNode.right = copy(root.right);
        return newNode;
    }

    /**
     * Adds a new key-value association to this map. If the key already exists in this map,
     * the value is replaced and the old value is returned. Otherwise, 'null' is returned.
     * @param key a variable != null.
     * @param value the constant to be associated with the key (can also be 'null').
     * @return the old value if the key already existed in this map, or 'null' otherwise.
     */
    public IntConst put(IntConst key, IntConst value) {
        if (this.root == null){
            this.root = new TreeNode(key,value);
            return null;
        }else{
            return this.root.put(key,value);
        }
    }

    /**
     * Returns the value associated with the specified key. Returns 'null' if the key is not
     * contained in this map.
     * @param key a constant != null.
     * @return the value associated with the specified key (or 'null' if the key is not contained in
     * this map).
     */
    public IntConst get(IntConst key) {
        if (this.root == null){
            return null;
        }else{
            return this.root.get(key);
        }
    }

    /**
     * Calculates the number of keys that are common between this map and another specified map.
     *
     * The operation does not modify either of the maps and ensures that only keys that are present
     * in both maps are considered in the count.
     *
     * @param other The other map to compare with this map, other != null.
     * @return The number of common keys between the two maps.
     */
    public int countCommonKeys(ConstConstTreeMap other) {
        if (other.root != null) {
            return count(other.root);
        }
        return -1;
    }

    private int count(TreeNode node){
        int count = 0;
        if (node == null){
            return 0;
        }
        if (this.root.get(node.key) != null){
            count+= 1;
        }

        count = count + count(node.left);
        count = count + count(node.left);
        return count;
    }

    /**
     * Returns a string representation of this 'map' with all its mappings in the format: key
     * followed by '=' and the value. The list of mappings is enclosed in square
     * brackets ("[]"). Adjacent elements are separated by ','.
     * The mappings are listed in ascending order according to the key order relation.
     * Example: "[-2=0,1=4,2=4,3=-1,5=5,8=10]"
     *
     * @return the string representation of this map.
     */
    public String toString() {
        if (this.root == null){
            return "[]";
        }else{
            return "[" + this.root + "]";
        }
    }

    /**
     * Returns a string representation of this 'map' listing only those mappings of 'this'
     * with keys lying in the specified inclusive range. The representation has the following
     * format: key followed by '=' and the value. The list of mappings is enclosed in square
     * brackets ("[]"). Adjacent elements are separated by ','.
     * The mappings are listed in ascending order according to the key order relation.
     * Example: "[2=4,3=-1,5=5]"
     *
     * This method exploits the structure of the binary search tree and traverses only
     * relevant parts of the tree.
     *
     * @param lower the inclusive lower bound for the range of keys, lower != null.
     * @param upper the inclusive upper bound for the range of keys, lower <= upper, upper != null.
     * @return the string representation of a range of mappings of this map.
     */
    public String toString(IntConst lower, IntConst upper) {
        if (this.root == null){
            return "[]";
        }else{
            return "[" + this.root.toString(lower, upper) + "]";
        }
    }
}

// TODO: define further classes, if needed (either here or in a separate file).
class TreeNode{
    TreeNode left,right;
    final IntConst key;
    IntConst value;

    public TreeNode(IntConst k, IntConst v){
        this.key = k;
        this.value = v;
        this.left = null;
        this.right = null;
    }

    public IntConst put(IntConst k, IntConst v) {
        if (this.key.isEqual(k)){
            IntConst oldV = this.value;
            this.value = v;
            return oldV;
        } else if (k.lessThan(this.key)){
            if (this.left == null){
                this.left = new TreeNode(k, v);
                return null;
            } else {
                return this.left.put(k, v);
            }
        } else {
            if (this.right == null){
                this.right = new TreeNode(k, v);
                return null;
            } else {
                return this.right.put(k, v);
            }
        }
    }

    public IntConst get(IntConst k) {
        if (k.isEqual(this.key)){
            return this.value;
        }else{
            if (k.lessThan(this.key)){
                if (this.left == null){
                    return null;
                }else{
                    return this.left.get(k);
                }
            }else {
                if (this.right == null){
                    return null;
                }else{
                    return this.right.get(k);
                }
            }
        }
    }

    public String toString() {
        String result = "";

        if (this.left != null) {
            result += this.left + ",";
        }

        result += this.key + "=" + this.value;

        if (this.right != null) {
            result += "," + this.right;
        }

        return result;
    }

    public String toString(IntConst lower, IntConst upper) {
        String result = "";

        // Linken Teilbaum verarbeiten und nur hinzufügen, wenn nicht leer
        if (this.left != null) {
            String leftResult = this.left.toString(lower, upper);
            if (!leftResult.isEmpty()) {
                result += leftResult;
            }
        }

        // Aktuellen Knoten hinzufügen, wenn er im Bereich liegt
        if ((lower.lessThan(this.key) || lower.isEqual(this.key)) && (this.key.lessThan(upper) || this.key.isEqual(upper))) {
            if (!result.isEmpty()) {
                result += ",";
            }
            result += this.key + "=" + this.value;
        }

        // Rechten Teilbaum verarbeiten und nur hinzufügen, wenn nicht leer
        if (this.right != null) {
            String rightResult = this.right.toString(lower, upper);
            if (!rightResult.isEmpty()) {
                if (!result.isEmpty()) {
                    result += ",";
                }
                result += rightResult;
            }
        }

        return result;
    }

}