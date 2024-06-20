package Test1.BlockQueue;

/**
 * A queue for 'Block' objects implemented as a singly linked list. The number of elements of the
 * queue is not limited. The queue may also contain entries of 'null'.
 */
//
// TODO: Complete the methods in 'BlockQueue'.
//       You can define further classes and methods for the implementation of
//       the singly linked list if needed.
//       Do NOT use the Java-Collection framework in 'Building' or any other class.
//
public class BlockQueue {

    //TODO: additional variables, constructors and methods must be private.
    private ListNode head, tail;

    /**
     * Initializes 'this' as an empty list.
     */
    public BlockQueue() {
        //TODO: implement constructor
        this.head = null;
        this.tail = null;
    }

    /**
     * Initializes this queue as an independent copy of 'queue'. Later changes of 'this'
     * will not affect 'queue' and vice versa.
     *
     * @param queue the queue from which the elements are copied to 'this', queue != null.
     */
    public BlockQueue(BlockQueue queue) {
        //TODO: implement constructor.
        this.head = new ListNode(queue.head.getV());
        if (queue.head.getN() != null){
            ListNode node = queue.head;
            ListNode nodeQ = queue.head.getN();

            while (nodeQ.getN() != null){
                ListNode newNode = new ListNode(nodeQ.getV());
                node.setN(newNode);
                node = nodeQ.getN();
                nodeQ = nodeQ.getN();
            }
            this.tail = nodeQ;

        }else{
            this.tail = this.head;
        }
    }

    /**
     * Adds the specified element 'v' to this queue.
     *
     * @param v the variable that is added ('v' can also be 'null').
     */
    public void add(Block v) {
        //TODO: implement method.
        if (this.head == null){
            this.head = this.tail = new ListNode(v);
        }else if (this.head.getN() == null){
            this.tail = new ListNode(v);
            this.head.setN(this.tail);
        }else{
            ListNode newN = new ListNode(v);
            this.tail.setN(newN);
            this.tail = newN;
        }
    }

    /**
     * Retrieves and removes an element from this queue. Returns 'null' if the list is empty.
     *
     * @return the next element in this queue, or 'null' if the queue is empty.
     */
    public Block poll() {
        //TODO: implement method.
        if (this.head == null){
            return null;
        }
        if (this.head.getN() == null){
            Block returnV = this.head.getV();
            this.head = this.tail = null;
            return returnV;
        }else{
            ListNode newHead = this.head.getN();
            Block returnV = this.head.getV();
            this.head = newHead;
            return returnV;
        }
    }

    /**
     * Returns the number of entries in this queue (including 'null' entries).
     *
     * @return the number of entries in this queue (including 'null' entries).
     */
    public int size() {
        if (this.head == null){
            return 0;
        }
        if (this.head.getN() == null){
            return 1;
        }
        int size = 1;
        ListNode n = this.head;
        while (n.getN() != null){
            size = size +1;
            n = n.getN();
        }
        return size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * Returns a string representation of this queue. The string representation consists
     * of the queue's elements in the order they have been added to the queue,
     * enclosed in square brackets ("[]"). Adjacent elements are separated by ','.
     * Example: "[[2x5],[4x2],[2x3]]"
     *
     * @return a string representation of this queue.
     */
    public String toString() {
        if (this.head == null){
            return "[]";
        }
        if (this.head.getN() == null){
            return "[" + this.head.getV() + "]";
        }
        String[] array = new String[size()];
        int i = 0;
        ListNode n = this.head;
        while (n.getN() != null){
            array[i] = String.valueOf(n.getV());
            i++;
            n = n.getN();
        }

        String txt = "";
        for (int j = 0; j < array.length-1; j++) {
            txt = txt + array[j] + ",";
        }

        txt = txt +this.tail.getV();

        return "[" + txt + "]";
    }
}

// TODO: define further classes, if needed (either here or in a separate file).

class ListNode {

    private Block value;
    private ListNode next;

    public ListNode(){
        value = null;
        next = null;
    }

    public ListNode(Block v){
        value = v;
        next = null;
    }

    public ListNode(Block v, ListNode n){
        value = v;
        next = n;
    }

    public void setV(Block v){value = v;}
    public Block getV(){return this.value;}
    public void setN(ListNode n){next = n;}
    public ListNode getN(){return this.next;}
}
