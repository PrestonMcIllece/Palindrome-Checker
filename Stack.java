/**
 * Stack.java
 * Preston McIllece and Vicky Wang's Lab6
 * 
 * Interface specifying standard stack operations.
 *
 * @author Greg Gagne - February 2017
 */

public interface Stack<T>
{
	/**
	 * Pushes item onto stack top
	 */
	public void push(T item);

	/**
	 * Removes and returns the item at the top of the stack
	 *
	 * If the stack is empty, returns null
	 */
	public T pop();

	/**
	 * Returns (but does not remove) the item at the top of the stack
	 *
	 * If the stack is empty, returns null
	 */
	public T peek();

	/**
	 * Returns true if the stack is empty, false otherwise
	 */
	public boolean isEmpty();
}
