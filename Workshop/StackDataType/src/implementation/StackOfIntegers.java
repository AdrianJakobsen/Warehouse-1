package implementation;

public class StackOfIntegers {
	private int capacity;
	private int size;
	private int[] elements;
	
	public StackOfIntegers(int numberOfElements) {
		capacity = numberOfElements;
		elements = new int[numberOfElements];
		size = 0;
	}

	public StackOfIntegers() {
		this(16);
	}

	public int getCapacity() {
		return capacity;
	}

	public int getSize() {
		return size;
	}

	public void push(int numberToPush) {
		elements[size] = numberToPush;
		size++;
	}

	public int pop() {
		return elements[--size];
	}

}
