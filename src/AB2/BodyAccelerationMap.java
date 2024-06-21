package AB2;
import AB1.Vector3;

/**
 * A map that associates a body with an acceleration vector. The number of
 * key-value pairs is not limited.
 */
public class BodyAccelerationMap {

    //TODO: declare variables.
    private Body[] keys;
    private Vector3[] values;
    private int size;

    /**
     * Initializes this map with an initial capacity.
     * @param initialCapacity specifies the size of the internal array. initialCapacity > 0.
     */
    public BodyAccelerationMap(int initialCapacity) {
        //TODO: define constructor.
        this.keys = new Body[initialCapacity];
        this.values = new Vector3[initialCapacity];
        this.size = 0;
    }

    /**
     * Adds a new key-value association to this map. If the key already exists in this map,
     * the value is replaced and the old value is returned. Otherwise, 'null' is returned.
     * @param key a body != null.
     * @param acceleration the acceleration vector to be associated with the key.
     * @return the old value if the key already existed in this map, or 'null' otherwise.
     */
    public Vector3 put(Body key, Vector3 acceleration) {
        //TODO: implement method.
        if (size == keys.length){
            doubleCapacity();
        }

        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null){
                if (keys[i] == key){
                    Vector3 oldV = values[i];
                    values[i] = acceleration;
                    return oldV;
                }
            }else{
                keys[i] = key;
                values[i] = acceleration;
                size++;
            }
        }

        sortArray();

        return null;
    }

    private void sortArray() {
        for (int i = 0; i < keys.length; i++) {
            if (i < size){
                for (int j = 1; j < keys.length; j++) {
                    if (i != j){
                        if (keys[i].getMass() < keys[j].getMass()){
                            Body temp = keys[j];
                            Vector3 tempV = values[j];
                            keys[j] = keys[i];
                            values[j] = values[i];
                            keys[i] = temp;
                            values[i] = tempV;
                        }
                    }
                }
            }
        }
    }

    private void doubleCapacity() {
        Body[] newK = new Body[keys.length*2];
        Vector3[] newV = new Vector3[keys.length*2];
        for (int i = 0; i < keys.length; i++) {
            newK[i] = keys[i];
            newV[i] = values[i];
        }
        this.keys = newK;
        this.values = newV;
    }

    /**
     * Returns the value associated with the specified key, i.e. the acceleration vector
     * associated with the specified body. Returns 'null' if the key is not contained in this map.
     * @param key a body != null.
     * @return the value associated with the specified key (or 'null' if the key is not contained in
     * this map).
     */
    public Vector3 get(Body key) {
        //TODO: implement method.
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == key){
                return values[i];
            }
        }
        return null;
    }
}
