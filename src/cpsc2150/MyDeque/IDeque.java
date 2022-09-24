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
}
