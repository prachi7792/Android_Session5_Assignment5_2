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
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack mystack1 = new FixedStack(7);
	    FixedStack mystack2 = new FixedStack(8);

	    // these loops cause each stack to grow
	    for(int i=0; i<12; i++) mystack1.push(i);
	    for(int i=0; i<8; i++) mystack2.push(i);

	    // pop those numbers off the stack
	    System.out.println("Stack in mystack1:");     //message to be printed
	    for(int i=0; i<6; i++)    //these loops cause each stack to grow
	       System.out.println(mystack1.pop());

	    System.out.println("Stack in mystack2:");     //message to be printed
	    for(int i=0; i<8; i++)    //these loops cause each stack to grow
	       System.out.println(mystack2.pop());
	}


	}


