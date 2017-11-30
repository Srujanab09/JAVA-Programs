package example;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Stack<T> {

	   private int capacity = 10;
	    private int pointer  = 0;
	    private T[] objects = (T[]) new Object[capacity];
	    int a =5, b=5, c=8;
		public void extra(){
		 if(a <=5 && b> 4 || c>=10)
			 ;
		}
	    public void push(T o) {
		if(pointer >= capacity)
		    throw new RuntimeException("Stack exceeded capacity!");
		objects[pointer++] = o;
	    }
	    public T pop() {
		if(pointer <= 0)
		    throw new EmptyStackException();
		return objects[--pointer];
	    }
	    public boolean isEmpty() {
		return pointer <= 0;
	    } 
	

}
