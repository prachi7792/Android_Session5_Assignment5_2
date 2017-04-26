/**
 * this for files
 * @author Acer
 * 
 * @date Apr 26, 2017
 */
package mypack;

// TODO: Auto-generated Javadoc
/**
 * this for classes.
 */
public class FixedStack implements Stack{
	  
  	/** The stck. */
  	private int stck[];
	  
  	/** The tos. */
  	private int tos;
	  
  	/**
  	 * Instantiates a new fixed stack.
  	 *
  	 * @param size the size
  	 */
  	FixedStack(int size) {
		    stck = new int[size];
		    tos = -1;
}
	  
	  /* (non-Javadoc)
  	 * @see mypack.Stack#push(int)
  	 */
  	public void push(int item) {
		    if(tos==stck.length-1) // use length member 
		      System.out.println("Stack is full.");      //message to be print
		    else 
		      stck[++tos] = item;
		  }

		  /* (non-Javadoc)
  		 * @see mypack.Stack#pop()
  		 */
  		// Pop an item from the stack
		  public int pop() {
		    if(tos < 0) {
		      System.out.println("Stack underflow.");    //message to be print
		      return 0;
		    }
		    else 
		      return stck[tos--];
		  }
		}



