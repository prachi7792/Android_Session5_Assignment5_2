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
public class IfStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack;
		VariableStack ds = new VariableStack(5); 
		FixedStack fs = new FixedStack(8);
	mystack = ds;     //load dynamic stack
	  for(int i=0; i<12; i++)     //these loops cause each stack to grow
		  mystack.push(i);
	mystack = fs;     // load fixed stack
	 for(int i=0; i<8; i++)      // these loops cause each stack to grow.
		 mystack.push(i);
	mystack = ds;    //load dynamic stack
	System.out.println("Values in dynamic stack:");    //values should be implemented.
	for(int i=0; i<12; i++)     //these loops cause each stack to grow
		System.out.println(mystack.pop());
	mystack = fs;    // load fixed stack
	System.out.println("Values in fixed stack:");      //values should be implemented.
	for(int i=0; i<8; i++)      //these loops cause each stack to grow
		System.out.println(mystack.pop());
	}


	}


