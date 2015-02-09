package test;

import static org.junit.Assert.*;
import junit.framework.Assert;
import implementation.StackOfIntegers;

import org.junit.Test;

public class StackOfIntegersTests {

	@Test
	public void createStackOfIntegers() {
		StackOfIntegers stack = new StackOfIntegers();
		assertNotNull(stack);
		assertEquals(16, stack.getCapacity());	
	}
	
	@Test
	public void createStackWithCapacityOf10(){
		StackOfIntegers stack = new StackOfIntegers(10);
		assertEquals(10, stack.getCapacity());
	}
	
	@Test
	public void push_addNumberToStack_CorrectSize(){
		StackOfIntegers stack = new StackOfIntegers(10);
		stack.push(1);
		assertEquals(1, stack.getSize());
	}
	
	@Test
	public void push_addTwoNumberToStack_CorrectSize(){
		StackOfIntegers stack = new StackOfIntegers(10);
		stack.push(1);
		stack.push(3);
		assertEquals(2, stack.getSize());
	}
	
	@Test
	public void pop_removeFirstNumberFromStack_ReturnCorrectNUmber(){
		StackOfIntegers stack = new StackOfIntegers(10);
		stack.push(1);
		int firstElementInStack = stack.pop();
		assertEquals(1, firstElementInStack);
	}
	
	@Test
	public void pop_pushTwoPopOneFromStack_ReturnCorrectNUmber(){
		StackOfIntegers stack = new StackOfIntegers(10);
		stack.push(1);
		stack.push(3);
		int firstElementInStack = stack.pop();
		assertEquals(3, firstElementInStack);
	}
	@Test
	public void pop_removesTwoNUmbersFromStack_StackHasCorrectSize(){
		StackOfIntegers stack = new StackOfIntegers(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.pop();
		stack.pop();
		
		assertEquals(1, stack.getSize());
	}
}