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
public class NewMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableStack mystack = new VariableStack(5);
		VariableStack mystack3 = new VariableStack(8);

 for(int i=0; i<12; i++)     //these loops cause each stack to grow
	 mystack.push(i);
 for(int i=0; i<20; i++)     //these loops cause each stack to grow
	 mystack3.push(i);
System.out.println("Stack in mystack:");    //message to be printed
for(int i=0; i<12; i++)
	System.out.println(mystack.pop());
System.out.println("Stack in mystack2:");   //message to be printed

	}


	}


