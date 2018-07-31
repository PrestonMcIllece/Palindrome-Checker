/*
 * Preston McIllece and Vicky Wang's Lab6
 * 
 * This program implements a Stack using an arrayList
 */ 

import java.util.ArrayList;


public class ListStack<T> implements Stack<T> {
	private ArrayList<T> arrayList;
	private int top = 0;
	
	//default constructor
	public ListStack() {
		arrayList = new ArrayList<T>();
	}

	//adds things to the end of the arrayList
	@Override
	public void push(T item) {
		arrayList.add(item);
		top++;
	}

	// returns and removes whatever is at the end of the arrayList
	@Override
	public T pop() {
		T returnValue = null;
		
		if(!isEmpty()) {	
			returnValue = arrayList.get(top - 1);
			arrayList.remove(top - 1);
			top--;
		}
		return returnValue;
	}

	//returns but doesn't remove last thing in arrayList
	@Override
	public T peek() {
		T returnValue = null;
		if(!isEmpty())
			returnValue = arrayList.get(top - 1);
		return returnValue;
	}

	//checks if arrayList is empty or not
	@Override
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

}
