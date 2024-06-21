package AB2;

/**
 * A queue of bodies. A collection designed for holding bodies prior to processing.
 * The bodies of the queue can be accessed in a FIFO (first-in-first-out) manner,
 * i.e., the body that was first inserted by 'add' is retrieved first by 'poll'.
 * The number of elements of the queue is not limited.
 */
public class BodyQueue {

    //TODO: declare variables.
    private Body[] bodies;
    private int size;
    private int tail;

    /**
     * Initializes this queue with an initial capacity.
     * @param initialCapacity the length of the internal array in the beginning,
     *                        initialCapacity > 0.
     */
    public BodyQueue(int initialCapacity) {
        //TODO: define constructor.
        this.bodies = new Body[initialCapacity];
        this.size = 0;
        this.tail = 0;
    }

    /**
     * Initializes this queue as an independent copy of the specified queue.
     * Calling methods of this queue will not affect the specified queue
     * and vice versa.
     * @param q the queue from which elements are copied to the new queue, q != null.
     */
    public BodyQueue(BodyQueue q) {
        //TODO: define constructor.
        this.bodies = new Body[q.size()];

        for (int i = 0; i < bodies.length; i++) {
            bodies[i] = q.bodies[i];
        }
        this.size= q.size;
        this.tail = q.tail;
    }

    /**
     * Adds the specified body 'b' to this queue.
     * @param b the element that is added to the queue.
     */
    public void add(Body b) {
        //TODO: implement method.
        if (this.size == this.bodies.length){
            doubleCapacity();
        }
        bodies[tail] = b;
        tail++;
        size++;
    }

    private void doubleCapacity() {
        Body[] newBodies = new Body[bodies.length*2];
        for (int i = 0; i < bodies.length; i++) {
            newBodies[i] = bodies[i];
        }
        this.bodies = newBodies;
    }

    /**
     * Retrieves and removes the head of this queue,
     * or returns 'null' if this queue is empty.
     * @return the head of this queue (or 'null' if this queue is empty).
     */
    public Body poll() {
        if (this.size < 1){
            return null;
        }
        Body nB = this.bodies[0];
        shiftArray();
        tail--;
        size--;
        return nB;
    }

    private void shiftArray() {
        for (int i = 0; i < tail - 1; i++) {
            bodies[i] = bodies[i + 1];
        }
        bodies[tail - 1] = null;
    }

    /**
     * Returns the number of bodies in this queue.
     * @return the number of bodies in this queue.
     */
    public int size() {
        return this.size;
    }
}
