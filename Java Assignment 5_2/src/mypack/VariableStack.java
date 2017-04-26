/**
 * this for files
 * @author Acer
 * 
 * @date Apr 26, 2017
 */
package mypack;

/**
 * this for classes
 */
public class VariableStack implements Stack {
	  
	/** The stck. */
	private int stck[];
	  
	/** The tos. */
	private int tos;
	  
	  /**
	 * Instantiates a new variable stack.
	 *
	 * @param size the size
	 */
	VariableStack(int size) {
	    stck = new int[size];
	    tos = -1;
	  }
	  
	/* (non-Javadoc)
	 * @see mypack.Stack#push(int)
	 */
	public void push(int item) {
	    // if stack is full, allocate a larger stack
	    if(tos==stck.length-1) {
	      int temp[] = new int[stck.length * 2]; // double size
	      for(int i=0; i<stck.length; i++) temp[i] = stck[i];
	      stck = temp;
	      stck[++tos] = item;
	    }
	    else 
	      stck[++tos] = item;
	  }

	  /* (non-Javadoc)
	 * @see mypack.Stack#pop()
	 */
	// Pop an item from the stack
	  public int pop() {
	    if(tos < 0) {
	      System.out.println("Stack underflow.");
	      return 0;
	    }
	    else 
	      return stck[tos--];
	  }
}


