package AB3;

import AB2.Body;

/**
 * A list of bodies implemented as a singly linked list. The number of elements of the list is
 * not limited.
 */
//
// TODO: define further classes and methods for the implementation of the singly linked list, if
//  needed.
//
public class BodySinglyLinkedList {

    //TODO: declare variables.
    private ListNode head, tail;


    /**
     * Initializes 'this' as an empty list.
     */
    public BodySinglyLinkedList() {
        // TODO: implement constructor.
        this.head = null;
    }

    /**
     * Constructor: initializes this list as an independent copy of the specified list.
     * Calling methods of this list will not affect the specified list
     * and vice versa.
     *
     * @param list the list from which elements are copied to the new list, list != null.
     */
    public BodySinglyLinkedList(BodySinglyLinkedList list) {

    }

    /**
     * Inserts the specified element 'b' at the beginning of this list.
     *
     * @param b the body that is added (b can also be 'null').
     */
    public void addFirst(Body b) {
        // TODO: implement method.
        if (head == null){
            head = tail = new ListNode(b);
        }else if (head.getNext() == null){
            ListNode newNode = new ListNode(b, head);
            tail = head;
            head = newNode;
        }else {
            head = new ListNode(b,head);
        }
    }

    /**
     * Appends the specified element 'b' to the end of this list.
     *
     * @param b the body that is added (b can also be 'null').
     */
    public void addLast(Body b) {
        // TODO: implement method.
        if (head == null){
            head = tail = new ListNode(b);
        }else if (head.getNext() == null){
            tail = new ListNode(b);
            head.setNext(tail);
        }else {
            ListNode newNode = new ListNode(b);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * Returns the last element in this list (at the end of the list) without removing it.
     * Returns 'null' if the list is empty.
     */
    public Body getLast() {
        // TODO: implement method.
        if (head == null){
            return null;
        }else if (head.getNext() == null){
            return head.getValue();
        }else{
            return tail.getValue();
        }
    }

    /**
     * Returns the first element in this list (at the beginning of the list) without removing it.
     * Returns 'null' if the list is empty.
     */
    public Body getFirst() {
        // TODO: implement method.
        if (head == null){
            return null;
        }else{
            return head.getValue();
        }
    }

    /**
     * Retrieves and removes the first element in this list, that is, the element with index 0.
     * Indices of subsequent elements are decremented accordingly. Returns 'null' if the list is
     * empty.
     *
     * @return the first element in this list, or 'null' if the list is empty.
     */
    public Body pollFirst() {
        // TODO: implement method.
        if (head == null){
            return null;
        }else if (head.getNext() == null){
            Body returnB = head.getValue();
            head = tail = null;
            return returnB;
        }else{
            Body returnB = head.getValue();
            head = head.getNext();
            return returnB;
        }
    }

    /**
     * Retrieves and removes the last element in this list, that is, the element with the highest
     * index. Returns 'null' if the list is empty.
     *
     * @return the last element in this list, or 'null' if the list is empty.
     */
    public Body pollLast() {
        // TODO: implement method.
        if (head == null){
            return null;
        }else if (head.getNext() == null){
            Body returnB = head.getValue();
            head = tail = null;
            return returnB;
        }else{
            ListNode node = head;
            while (node.getNext() != tail){
                node = node.getNext();
            }
            Body returnB = tail.getValue();
            tail = node;
            node.setNext(null);
            return returnB;
        }
    }

    /**
     * Inserts the specified element at the specified position in this list, such that a
     * following invocation of get(i) would return 'b'. Shifts the element currently at that
     * position (if any) and any subsequent elements to the right (adds one to their indices).
     *
     * @param i the position of the new element in the list, i >= 0 && i <= size().
     * @param b the body that is added (b can also be 'null').
     */
    public void add(int i, Body b) {
        // TODO: implement method.
        if (i == 0){
            if (head == null){
                head = tail = new ListNode(b);
            }else {
                head = new ListNode(b, head);
            }
        }else{
            ListNode node = head;
            while (i>1){
                i--;
                node = node.getNext();
            }
            ListNode newNode = new ListNode(b, node.getNext());
            node.setNext(newNode);
            if (node == tail){
                tail = newNode;
            }
        }
    }

    /**
     * Returns the element with the specified index in this list. Returns 'null' if the list is
     * empty.
     *
     * @param i the list index of the element to be retrieved, i >= 0 && i < size().
     * @return the retrieved element at the specified position.
     */
    public Body get(int i) {
        // TODO: implement method.
        if (i == 0){
            if (head == null){
                return null;
            }else {
                return head.getValue();
            }
        }else{
            ListNode node = head;
            while (i > 0){
                i--;
                node = node.getNext();
            }
            return node.getValue();
        }
    }

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if
     * this list does not contain the element. More formally, returns the lowest index i such
     * that b == get(i), or -1 if there is no such index.
     *
     * @param b the body to search for.
     * @return the index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contain the element.
     */
    public int indexOf(Body b) {
        // TODO: implement method.
        if (head == null){
            return -1;
        }else{
            ListNode node = head;
            int index = 0;
            while (node != null){
                if (node.getValue() == b){
                    return index;
                }
                index++;
                node = node.getNext();
            }
        }
        return -1;
    }

    /**
     * Returns the number of entries in this list (including 'null' entries).
     */
    public int size() {
        // TODO: implement method.
        if (head == null){
            return 0;
        } else if (head.getNext() == null) {
            return 1;
        }else{
            int count = 1;
            ListNode node = head;
            while (node.getNext() != null){
                count++;
                node = node.getNext();
            }
            return count;
        }
    }
}

// TODO: define further classes, if needed (either here or in a separate file).
class ListNode{

    private Body value;
    private ListNode next;

    public ListNode(){
        value = null;
        next = null;
    }

    public ListNode(Body b){
        value = b;
        next = null;
    }

    public ListNode(Body b, ListNode n){
        value = b;
        next = n;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public Body getValue() {
        return value;
    }

    public void setValue(Body value) {
        this.value = value;
    }
}