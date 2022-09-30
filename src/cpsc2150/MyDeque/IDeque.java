package cpsc2150.MyDeque;

/**
 * A deque containing floating-point numbers.
 * A deque is a data structure a double-ended queue that allows you
 * to insert and remove from both ends.
 * This deque is bounded by MAX_LENGTH
 */
public interface IDeque {
    public static final int MAX_LENGTH = 100;

    /** Adds x to the end of the deque
     *
     * @param x     double to be added to the end of the deque
     * @pre x!= NULL && queue.length() != MAX_LENGTH
     * @post x is at end of deque
     */
    public void enqueue(Double x);

    /** removes and returns the double at the front of the deque
     *
     * @return double at front of deque
     * @pre deque != NULL and first value in deque is a double
     * @post enqueue = first double in deque and deque = #deque
     */
    public Double dequeue();


    /** Adds x to the front of the deque
     *
     * @param x     double to be added to the front of the deque
     * @pre x != NULL && queue.length() != MAX_LENGTH
     * @post x is at beginning of deque
     */
    public void inject(Double x);

    /**removes and returns the double at the end of the deque
     *
     * @return double at end of deque
     * @pre deque != NULL and last value in deque is a double
     * @post inject = last double in deque and deque = #deque
     */
    public Double removeLast();

    /**returns the number of doubles in the deque
     *
     * @return number of doubles in deque
     * @pre deque != null
     * @post length = size of deque and deque = #deque
     */
    public int length();

    /**clears the entire deque
     *
     * @pre deque != NULL
     * @post deque = NULL
     */
    public void clear();

    /**
     * Should return a floating-point number in front of the deque
     * but it won't be removed from the deque.
     *
     * @return the floating-point number to the front of the deque.
     * @pre deque != NULL
     * @post floating-point number = front of the deque
     */
    //default Double Peek() {}

    /** Should return the floating-point number at the end of the deque
     *  but it won't remove it from the deque.
     *
     * @return floating-point number at the end of the deque
     * @pre deque != NULL
     * @post Peek = the floating-point number from the end of deque.
     */
    //default Double endOfDeque() {}

    /** Will insert 'x' at position 'pos' in the deque.
     *
     * @param x the double that will be inserted into 'pos'
     * @param pos the integer that will take in 'x' as a position.
     *
     * @pre deque != NULL AND 'x' is a double AND 'pos' is an int
     * @post pos = x
     */
    //default void insert(Double x, int pos){}

    /** Will remove whatever floating-point number that was in the 'pos'
     *  position of the deque and it should return it.
     *
     * @param pos holds the floating-point number that will be removed from the deque
     * @return the value of 'pos' after removing it from the deque
     *
     * @pre deque != NULL AND pos is an int
     * @post pos = floating-point number AND pos is removed from deque
     *
     */
    //default Double remove(int pos) {}

    /** Should return whatever floating-point number that was in the position 'pos'
     *  but does not remove it.
     *
     * @param pos holds the floating-point number that was in the position of the deque
     * @return 'pos', the floating-point number of the position of the deque.
     *
     * @pre  deque != NULL AND pos is an int
     * @post pos = floating-point number
     */
    //default Double get(int pos) {}
}
