/*
 * Preston McIllece and Vicky Wang's Lab6
 * 
 * This program implements a Stack using an array
 */

import java.util.Iterator;
 

public class ArrayStack<T> implements Stack<T> {
	public static final int CAPACITY_MULTIPLIER = 2;
	public static final int DEFAULT_CAPACITY = 15;
	
	private int capacity = 0;
	private int numberOfElements = 0;
	private T[] elements;
	
	//default constructor
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}

	//constructor with specified capacity
	public ArrayStack(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Capacity must be >= 0");
		}
		
		this.capacity = capacity;
		elements = (T[])new Object[capacity];	
		}

	//adds parameter to end of array
	@Override
	public void push(T item) {
		ensureCapacity();
		elements[numberOfElements] = item;
		numberOfElements++;
	}

	//returns and removes thing at end of array.
	@Override
	public T pop() {
		T returnValue = null;
		if(!isEmpty()) {
			returnValue = elements[numberOfElements - 1];
			elements[numberOfElements - 1] = null;
			numberOfElements--;
		}
		return returnValue;
	}

	//returns but doesn't remove thing at end of array
	@Override
	public T peek() {
		T returnValue = null;
		if(!isEmpty()) 
			returnValue = elements[numberOfElements - 1];
		
		return returnValue;
	}

	//checks if the array is empty
	@Override
	public boolean isEmpty() {
		boolean check = false;
		if (numberOfElements == 0)
			check = true;
		return check;
	}
	/**
	 * This ensures the array has sufficient capacity to store an additional element.
	 */
	private void ensureCapacity() {
		if (numberOfElements == elements.length) {
			T[] newArray = (T[])new Object[(numberOfElements+1) * CAPACITY_MULTIPLIER];
			System.arraycopy(elements,0,newArray,0,numberOfElements);
			elements = newArray;
		}
	}
}
